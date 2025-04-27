package com.lojacosmeticos.lojacosmeticos.Spring.controller;

import com.lojacosmeticos.lojacosmeticos.Spring.model.ContaReceber;
import com.lojacosmeticos.lojacosmeticos.Spring.service.ContaReceberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/contas-a-receber")
public class ContaReceberController {
    @Autowired
    private ContaReceberService service;

    @PostMapping
    public ResponseEntity<ContaReceber> criarConta(@RequestBody ContaReceber conta) {
        ContaReceber novaConta = service.salvarConta(conta);
        return ResponseEntity.ok(novaConta);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ContaReceber> atualizarConta(@PathVariable Long id, @RequestBody ContaReceber conta) {
        ContaReceber contaAtualizada = service.atualizarConta(id, conta);
        return ResponseEntity.ok(contaAtualizada);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarConta(@PathVariable Long id) {
        service.deletarConta(id);
        return ResponseEntity.noContent().build();
    }
}
