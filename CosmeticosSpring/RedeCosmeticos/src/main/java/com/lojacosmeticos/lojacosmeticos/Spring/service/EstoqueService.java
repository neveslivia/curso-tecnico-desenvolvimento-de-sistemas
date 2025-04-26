package com.lojacosmeticos.lojacosmeticos.Spring.service;

import com.lojacosmeticos.lojacosmeticos.Spring.model.Estoque;
import com.lojacosmeticos.lojacosmeticos.Spring.repository.EstoqueRepository;
import com.lojacosmeticos.lojacosmeticos.Spring.repository.FornecedorRepository;
import com.lojacosmeticos.lojacosmeticos.Spring.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstoqueService {
    @Autowired
    private EstoqueRepository estoqueRepository;

    @Autowired
    private ProdutoRepository produtoRepository;

    @Autowired
    private FornecedorRepository fornecedorRepository;

    public Estoque salvarEstoque(Estoque estoque) {
        if (estoque.getQuantidadeAtual() == null || estoque.getQuantidadeAtual() < 0) {
            throw new RuntimeException("A quantidade de estoque não pode ser negativa.");
        }

        if (!produtoRepository.existsById(estoque.getProduto().getId())) {
            throw new RuntimeException("Produto informado não existe.");
        }

        if (!fornecedorRepository.existsById(estoque.getFornecedor().getId())) {
            throw new RuntimeException("Fornecedor informado não existe.");
        }

        return estoqueRepository.save(estoque);
    }

    public Estoque buscarPorId(Long id) {
        return estoqueRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Estoque não encontrado para o ID informado."));
    }

    public List<Estoque> listarTodos() {
        return estoqueRepository.findAll();
    }

    public Estoque atualizarEstoque(Long id, Estoque estoqueAtualizado) {
        Estoque estoqueExistente = buscarPorId(id);

        if (estoqueAtualizado.getQuantidadeAtual() == null || estoqueAtualizado.getQuantidadeAtual() < 0) {
            throw new RuntimeException("A quantidade de estoque não pode ser negativa.");
        }

        if (!produtoRepository.existsById(estoqueAtualizado.getProduto().getId())) {
            throw new RuntimeException("Produto informado não existe.");
        }

        if (!fornecedorRepository.existsById(estoqueAtualizado.getFornecedor().getId())) {
            throw new RuntimeException("Fornecedor informado não existe.");
        }

        estoqueExistente.setProduto(estoqueAtualizado.getProduto());
        estoqueExistente.setFornecedor(estoqueAtualizado.getFornecedor());
        estoqueExistente.setCategoriaProduto(estoqueAtualizado.getCategoriaProduto());
        estoqueExistente.setQuantidadeAtual(estoqueAtualizado.getQuantidadeAtual());

        return estoqueRepository.save(estoqueExistente);
    }

    public void excluirEstoque(Long id) {
        Estoque estoque = buscarPorId(id);
        estoqueRepository.delete(estoque);
    }

    public Estoque adicionarQuantidade(Long id, Integer quantidade) {
        Estoque estoque = buscarPorId(id);

        if (quantidade == null || quantidade <= 0) {
            throw new RuntimeException("Quantidade de entrada inválida.");
        }

        estoque.setQuantidadeAtual(estoque.getQuantidadeAtual() + quantidade);
        return estoqueRepository.save(estoque);
    }

    public Estoque reduzirQuantidade(Long id, Integer quantidade) {
        Estoque estoque = buscarPorId(id);

        if (quantidade == null || quantidade <= 0) {
            throw new RuntimeException("Quantidade de saída inválida.");
        }

        if (estoque.getQuantidadeAtual() < quantidade) {
            throw new RuntimeException("Quantidade insuficiente em estoque.");
        }

        estoque.setQuantidadeAtual(estoque.getQuantidadeAtual() - quantidade);
        return estoqueRepository.save(estoque);
    }


}
