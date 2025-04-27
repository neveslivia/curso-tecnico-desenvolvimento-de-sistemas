package com.lojacosmeticos.lojacosmeticos.Spring.service;

import com.lojacosmeticos.lojacosmeticos.Spring.model.EntradaEstoque;
import com.lojacosmeticos.lojacosmeticos.Spring.repository.EntradaEstoqueRepository;
import com.lojacosmeticos.lojacosmeticos.Spring.repository.EstoqueRepository;
import com.lojacosmeticos.lojacosmeticos.Spring.repository.FornecedorRepository;
import com.lojacosmeticos.lojacosmeticos.Spring.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class EntradaEstoqueService {
    @Autowired
    private EntradaEstoqueRepository entradaEstoqueRepository;

    @Autowired
    private ProdutoRepository produtoRepository;

    @Autowired
    private EstoqueRepository estoqueRepository;

    @Autowired
    private FornecedorRepository fornecedorRepository;

    public EntradaEstoque salvarEntrada(EntradaEstoque entradaEstoque) {
        if (entradaEstoque.getQuantidade() == null || entradaEstoque.getQuantidade() <= 0) {
            throw new RuntimeException("A quantidade de entrada precisa ser maior que zero.");
        }

        if (!produtoRepository.existsById(entradaEstoque.getProduto().getId())) {
            throw new RuntimeException("Produto não encontrado.");
        }

        if (!estoqueRepository.existsById(entradaEstoque.getEstoque().getId())) {
            throw new RuntimeException("Estoque não encontrado.");
        }

        if (!fornecedorRepository.existsById(entradaEstoque.getFornecedor().getId())) {
            throw new RuntimeException("Fornecedor não encontrado.");
        }

        entradaEstoque.setDataEntrada(LocalDateTime.now());
        return entradaEstoqueRepository.save(entradaEstoque);
    }

    public EntradaEstoque buscarPorId(Long id) {
        return entradaEstoqueRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Entrada de estoque não encontrada."));
    }

    public EntradaEstoque atualizarEntrada(Long id, EntradaEstoque entradaEstoque) {
        EntradaEstoque entradaExistente = buscarPorId(id);

        if (entradaEstoque.getQuantidade() == null || entradaEstoque.getQuantidade() <= 0) {
            throw new RuntimeException("A quantidade de entrada precisa ser maior que zero.");
        }

        if (!produtoRepository.existsById(entradaEstoque.getProduto().getId())) {
            throw new RuntimeException("Produto não encontrado.");
        }

        if (!estoqueRepository.existsById(entradaEstoque.getEstoque().getId())) {
            throw new RuntimeException("Estoque não encontrado.");
        }

        if (!fornecedorRepository.existsById(entradaEstoque.getFornecedor().getId())) {
            throw new RuntimeException("Fornecedor não encontrado.");
        }

        entradaExistente.setProduto(entradaEstoque.getProduto());
        entradaExistente.setEstoque(entradaEstoque.getEstoque());
        entradaExistente.setFornecedor(entradaEstoque.getFornecedor());
        entradaExistente.setQuantidade(entradaEstoque.getQuantidade());
        entradaExistente.setCategoria(entradaEstoque.getCategoria());
        entradaExistente.setDataEntrada(LocalDateTime.now());

        return entradaEstoqueRepository.save(entradaExistente);
    }

    public void excluirEntrada(Long id) {
        EntradaEstoque entradaExistente = buscarPorId(id);
        entradaEstoqueRepository.delete(entradaExistente);
    }
}
