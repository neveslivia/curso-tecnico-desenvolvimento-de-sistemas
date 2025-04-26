package com.lojacosmeticos.lojacosmeticos.Spring.service;

import com.lojacosmeticos.lojacosmeticos.Spring.exception.PagamentoBusinessException;
import com.lojacosmeticos.lojacosmeticos.Spring.exception.PagamentoNotFoundException;
import com.lojacosmeticos.lojacosmeticos.Spring.model.Pagamento;
import com.lojacosmeticos.lojacosmeticos.Spring.repository.PagamentoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PagamentoService {
    private final PagamentoRepository pagamentoRepository;

    public PagamentoService(PagamentoRepository pagamentoRepository) {
        this.pagamentoRepository = pagamentoRepository;
    }

    public List<Pagamento> listarTodos() {
        return pagamentoRepository.findAll();
    }

    public Pagamento buscarPorId(Long id) {
        return pagamentoRepository.findById(id)
                .orElseThrow(() -> new PagamentoNotFoundException("Pagamento com ID " + id + " não encontrado."));
    }

    public Pagamento salvar(Pagamento pagamento) {
        if (pagamento.getValor() <= 0) {
            throw new PagamentoBusinessException("O valor do pagamento precisa ser maior que zero.");
        }
        return pagamentoRepository.save(pagamento);
    }

    public Pagamento atualizar(Long id, Pagamento pagamentoAtualizado) {
        Pagamento pagamentoExistente = buscarPorId(id);
        if (pagamentoAtualizado.getValor() <= 0) {
            throw new PagamentoBusinessException("O valor do pagamento precisa ser maior que zero.");
        }
        pagamentoAtualizado.setId(id);
        return pagamentoRepository.save(pagamentoAtualizado);
    }

    public void deletar(Long id) {
        Pagamento pagamento = buscarPorId(id);
        if (!pagamento.getStatusPagamento().name().equalsIgnoreCase("CANCELADO")) {
            throw new PagamentoBusinessException("Só é possível deletar pagamentos com status CANCELADO.");
        }
        pagamentoRepository.delete(pagamento);
    }
}
