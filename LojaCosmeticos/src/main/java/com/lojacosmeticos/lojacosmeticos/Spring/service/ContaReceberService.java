package com.lojacosmeticos.lojacosmeticos.Spring.service;

import com.lojacosmeticos.lojacosmeticos.Spring.exception.ContaReceberException;
import com.lojacosmeticos.lojacosmeticos.Spring.model.ContaReceber;
import com.lojacosmeticos.lojacosmeticos.Spring.repository.ContaReceberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class ContaReceberService {
    @Autowired
    private ContaReceberRepository repository;

    public ContaReceber salvarConta(ContaReceber conta) {

        if (conta.getValor() == null || conta.getValor() <= 0) {
            throw new ContaReceberException("O valor da conta deve ser maior que zero.");
        }
        if (conta.getDataPagamento().isBefore(LocalDate.now())) {
            throw new ContaReceberException("A data de pagamento não pode ser anterior à data de criação.");
        }
        if (conta.getPagamentoId() == null) {
            throw new ContaReceberException("O pagamento é obrigatório.");
        }
        if (conta.getVendas() == null) {
            throw new ContaReceberException("A venda é obrigatória.");
        }
        return repository.save(conta);
    }

    public ContaReceber atualizarConta(Long id, ContaReceber novaConta) {
        ContaReceber contaExistente = repository.findById(id)
                .orElseThrow(() -> new ContaReceberException("Conta a receber não encontrada."));

        if (contaExistente.getStatusPagamento().name().equals("PAGO")) {
            if (!contaExistente.getValor().equals(novaConta.getValor())) {
                throw new ContaReceberException("Não é permitido alterar o valor de uma conta que já foi paga.");
            }
        }
        return salvarConta(novaConta);
    }

    public void deletarConta(Long id) {
        ContaReceber conta = repository.findById(id)
                .orElseThrow(() -> new ContaReceberException("Conta a receber não encontrada."));

        if (conta.getStatusPagamento().name().equals("PAGO")) {
            throw new ContaReceberException("Não é permitido excluir uma conta que já foi paga.");
        }
        repository.delete(conta);
    }
}
