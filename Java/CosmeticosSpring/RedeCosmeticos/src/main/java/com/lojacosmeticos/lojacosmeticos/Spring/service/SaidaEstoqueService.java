package com.lojacosmeticos.lojacosmeticos.Spring.service;

import com.lojacosmeticos.lojacosmeticos.Spring.exception.ResourceNotFoundException;
import com.lojacosmeticos.lojacosmeticos.Spring.model.SaidaEstoque;
import com.lojacosmeticos.lojacosmeticos.Spring.repository.SaidaEstoqueRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaidaEstoqueService {
    private final SaidaEstoqueRepository repository;

    public SaidaEstoqueService(SaidaEstoqueRepository repository) {
        this.repository = repository;
    }

    public List<SaidaEstoque> listarSaidas() {
        return repository.findAll();
    }

    public SaidaEstoque buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Saída de estoque não encontrada com ID: " + id));
    }

    public SaidaEstoque salvarSaida(SaidaEstoque saidaEstoque) {
        return repository.save(saidaEstoque);
    }

    public SaidaEstoque atualizarSaida(Long id, SaidaEstoque novaSaida) {
        SaidaEstoque existente = buscarPorId(id);
        existente.setProduto(novaSaida.getProduto());
        existente.setEstoque(novaSaida.getEstoque());
        existente.setQuantidade(novaSaida.getQuantidade());
        existente.setDataSaida(novaSaida.getDataSaida());
        existente.setCategoria(novaSaida.getCategoria());
        existente.setFornecedor(novaSaida.getFornecedor());
        return repository.save(existente);
    }

    public void deletarSaida(Long id) {
        SaidaEstoque saida = buscarPorId(id);
        repository.delete(saida);
    }
}
