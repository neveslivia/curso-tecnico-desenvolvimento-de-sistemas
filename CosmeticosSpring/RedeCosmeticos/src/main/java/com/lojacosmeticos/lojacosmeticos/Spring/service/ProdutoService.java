package com.lojacosmeticos.lojacosmeticos.Spring.service;

import com.lojacosmeticos.lojacosmeticos.Spring.exception.ProdutoBusinessException;
import com.lojacosmeticos.lojacosmeticos.Spring.exception.ProdutoNotFoundException;
import com.lojacosmeticos.lojacosmeticos.Spring.model.Produto;
import com.lojacosmeticos.lojacosmeticos.Spring.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {
    private final ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public List<Produto> listarTodos() {
        return produtoRepository.findAll();
    }

    public Produto buscarPorId(Long id) {
        return produtoRepository.findById(id)
                .orElseThrow(() -> new ProdutoNotFoundException("Produto com ID " + id + " não encontrado."));
    }

    public Produto salvar(Produto produto) {
        if (produto.getPrecoProduto() == null || produto.getPrecoProduto() <= 0) {
            throw new ProdutoBusinessException("Preço do produto deve ser maior que zero.");
        }
        return produtoRepository.save(produto);
    }

    public Produto atualizar(Long id, Produto produtoAtualizado) {
        Produto produtoExistente = buscarPorId(id);
        if (produtoAtualizado.getPrecoProduto() == null || produtoAtualizado.getPrecoProduto() <= 0) {
            throw new ProdutoBusinessException("Preço do produto deve ser maior que zero.");
        }
        produtoAtualizado.setId(id);
        return produtoRepository.save(produtoAtualizado);
    }

    public void deletar(Long id) {
        Produto produto = buscarPorId(id);
        produtoRepository.delete(produto);
    }

}
