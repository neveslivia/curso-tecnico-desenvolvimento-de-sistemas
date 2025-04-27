package com.lojacosmeticos.lojacosmeticos.Spring.controller;

import com.lojacosmeticos.lojacosmeticos.Spring.model.EnderecoFornecedor;
import com.lojacosmeticos.lojacosmeticos.Spring.service.EnderecoFornecedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/endereco-fornecedor")
public class EnderecoFornecedorController {
    @Autowired
    private EnderecoFornecedorService enderecoFornecedorService;

    @GetMapping
    public ResponseEntity<List<EnderecoFornecedor>> listarTodos() {
        List<EnderecoFornecedor> enderecos = enderecoFornecedorService.listarTodos();
        return ResponseEntity.ok(enderecos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<EnderecoFornecedor> buscarPorId(@PathVariable Long id) {
        EnderecoFornecedor endereco = enderecoFornecedorService.buscarPorId(id);
        return ResponseEntity.ok(endereco);
    }

    @PostMapping
    public ResponseEntity<EnderecoFornecedor> criarEndereco(@RequestBody EnderecoFornecedor enderecoFornecedor) {
        EnderecoFornecedor novoEndereco = enderecoFornecedorService.salvarEndereco(enderecoFornecedor);
        return ResponseEntity.status(201).body(novoEndereco);
    }

    @PutMapping("/{id}")
    public ResponseEntity<EnderecoFornecedor> atualizarEndereco(@PathVariable Long id, @RequestBody EnderecoFornecedor enderecoAtualizado) {
        EnderecoFornecedor endereco = enderecoFornecedorService.atualizarEndereco(id, enderecoAtualizado);
        return ResponseEntity.ok(endereco);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarEndereco(@PathVariable Long id) {
        enderecoFornecedorService.deletarEndereco(id);
        return ResponseEntity.noContent().build();
    }
}
