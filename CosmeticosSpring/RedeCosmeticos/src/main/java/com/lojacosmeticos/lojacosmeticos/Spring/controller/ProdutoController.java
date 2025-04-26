package com.lojacosmeticos.lojacosmeticos.Spring.controller;

import com.lojacosmeticos.lojacosmeticos.Spring.dto.ProdutoDTO;
import com.lojacosmeticos.lojacosmeticos.Spring.model.EntradaEstoque;
import com.lojacosmeticos.lojacosmeticos.Spring.model.Produto;
import com.lojacosmeticos.lojacosmeticos.Spring.model.SaidaEstoque;
import com.lojacosmeticos.lojacosmeticos.Spring.repository.ProdutoRepository;
import com.lojacosmeticos.lojacosmeticos.Spring.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

    private final ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @GetMapping
    public ResponseEntity<List<ProdutoDTO>> listarTodos() {
        List<Produto> produtos = produtoService.listarTodos();
        List<ProdutoDTO> dtos = produtos.stream().map(produto -> {
            int entradas = produto.getEntradaEstoque().stream().mapToInt(EntradaEstoque::getQuantidade).sum();
            int saidas = produto.getSaidaEstoque().stream().mapToInt(SaidaEstoque::getQuantidade).sum();
            ProdutoDTO dto = new ProdutoDTO();
            dto.setId(produto.getId());
            dto.setNomeProduto(produto.getNomeProduto());
            dto.setDescricao(produto.getDescricao());
            dto.setPrecoProduto(produto.getPrecoProduto());
            dto.setQuantidadeEstoque(entradas - saidas);
            return dto;
        }).toList();

        return ResponseEntity.ok(dtos);
    }


    @GetMapping("/{id}")
    public ResponseEntity<Produto> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(produtoService.buscarPorId(id));
    }

    @PostMapping
    public ResponseEntity<Produto> salvar(@RequestBody Produto produto) {
        return new ResponseEntity<>(produtoService.salvar(produto), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Produto> atualizar(@PathVariable Long id, @RequestBody Produto produto) {
        return ResponseEntity.ok(produtoService.atualizar(id, produto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        produtoService.deletar(id);
        return ResponseEntity.noContent().build();
    }

}
