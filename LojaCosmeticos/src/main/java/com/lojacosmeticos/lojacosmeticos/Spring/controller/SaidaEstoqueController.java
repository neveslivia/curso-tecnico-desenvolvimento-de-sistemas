package com.lojacosmeticos.lojacosmeticos.Spring.controller;

import com.lojacosmeticos.lojacosmeticos.Spring.model.SaidaEstoque;
import com.lojacosmeticos.lojacosmeticos.Spring.service.SaidaEstoqueService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/saida_estoque")
public class SaidaEstoqueController {

    private final SaidaEstoqueService service;

    public SaidaEstoqueController(SaidaEstoqueService service) {
        this.service = service;
    }

    @GetMapping
    public List<SaidaEstoque> listarTodas() {
        return service.listarSaidas();
    }

    @GetMapping("/{id}")
    public ResponseEntity<SaidaEstoque> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(service.buscarPorId(id));
    }

    @PostMapping
    public ResponseEntity<SaidaEstoque> criar(@RequestBody SaidaEstoque saidaEstoque) {
        SaidaEstoque novaSaida = service.salvarSaida(saidaEstoque);
        return ResponseEntity.ok(novaSaida);
    }

    @PutMapping("/{id}")
    public ResponseEntity<SaidaEstoque> atualizar(@PathVariable Long id, @RequestBody SaidaEstoque saidaAtualizada) {
        SaidaEstoque saida = service.atualizarSaida(id, saidaAtualizada);
        return ResponseEntity.ok(saida);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        service.deletarSaida(id);
        return ResponseEntity.noContent().build();
    }
}


