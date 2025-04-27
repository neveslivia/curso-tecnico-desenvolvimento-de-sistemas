package com.lojacosmeticos.lojacosmeticos.Spring.service;

import com.lojacosmeticos.lojacosmeticos.Spring.model.Despesa;
import com.lojacosmeticos.lojacosmeticos.Spring.model.StatusPagamento;
import com.lojacosmeticos.lojacosmeticos.Spring.repository.DespesaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class DespesaService {
    @Autowired
    private DespesaRepository despesaRepository;

    public List<Despesa> listarTodasDespesas() {
        return despesaRepository.findAll();
    }

    public Optional<Despesa> buscarDespesaPorId(Long id) {
        return despesaRepository.findById(id);
    }

    public Despesa criarDespesa(Despesa despesa) {

        if (despesa.getValor() <= 0) {
            throw new IllegalArgumentException("O valor da despesa deve ser maior que zero.");
        }

        if (despesa.getDataPagamento().before(new Date())) {
            throw new IllegalArgumentException("A data de pagamento não pode ser anterior à data de criação.");
        }

        if (despesa.getStatusPagamento() == StatusPagamento.PAGO && despesa.getPagamentoId() == null) {
            throw new IllegalArgumentException("O pagamento não pode ser marcado como 'PAGO' sem um ID de pagamento.");
        }

        return despesaRepository.save(despesa);
    }

    public Despesa atualizarDespesa(Long id, Despesa despesaAtualizada) {
        Optional<Despesa> despesaExistente = despesaRepository.findById(id);
        if (!despesaExistente.isPresent()) {
            throw new IllegalArgumentException("Despesa não encontrada.");
        }

        Despesa despesa = despesaExistente.get();

        if (despesa.getStatusPagamento() == StatusPagamento.PAGO) {
            throw new IllegalArgumentException("Não é permitido alterar o valor de uma despesa já paga.");
        }

        despesa.setValor(despesaAtualizada.getValor());
        despesa.setDataPagamento(despesaAtualizada.getDataPagamento());
        despesa.setStatusPagamento(despesaAtualizada.getStatusPagamento());
        despesa.setPagamentoId(despesaAtualizada.getPagamentoId());
        despesa.setFornecedor(despesaAtualizada.getFornecedor());
        despesa.setFuncionario(despesaAtualizada.getFuncionario());

        return despesaRepository.save(despesa);
    }

    public void deletarDespesa(Long id) {
        Optional<Despesa> despesa = despesaRepository.findById(id);

        if (despesa.isPresent()) {
            if (despesa.get().getStatusPagamento() == StatusPagamento.PAGO) {
                throw new IllegalArgumentException("Não é permitido excluir despesas já pagas.");
            }
            despesaRepository.deleteById(id);
        } else {
            throw new IllegalArgumentException("Despesa não encontrada.");
        }
    }
}
