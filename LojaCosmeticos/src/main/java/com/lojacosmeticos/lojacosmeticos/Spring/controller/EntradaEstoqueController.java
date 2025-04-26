package com.lojacosmeticos.lojacosmeticos.Spring.controller;

import com.lojacosmeticos.lojacosmeticos.Spring.model.EntradaEstoque;
import com.lojacosmeticos.lojacosmeticos.Spring.service.EntradaEstoqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/entrada-estoque")
public class EntradaEstoqueController {
    @Autowired
    private EntradaEstoqueService entradaEstoqueService;

    @PostMapping
    public ResponseEntity<EntradaEstoque> criarEntrada(@RequestBody EntradaEstoque entradaEstoque) {
        try {
            EntradaEstoque entradaSalva = entradaEstoqueService.salvarEntrada(entradaEstoque);
            return new ResponseEntity<>(entradaSalva, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<EntradaEstoque> buscarEntradaPorId(@PathVariable Long id) {
        try {
            EntradaEstoque entrada = entradaEstoqueService.buscarPorId(id);
            return new ResponseEntity<>(entrada, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<EntradaEstoque> atualizarEntrada(@PathVariable Long id, @RequestBody EntradaEstoque entradaEstoque) {
        try {
            EntradaEstoque entradaAtualizada = entradaEstoqueService.atualizarEntrada(id, entradaEstoque);
            return new ResponseEntity<>(entradaAtualizada, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletarEntrada(@PathVariable Long id) {
        try {
            entradaEstoqueService.excluirEntrada(id);
            return new ResponseEntity<>("Entrada de estoque removida com sucesso!", HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>("Erro ao excluir a entrada de estoque.", HttpStatus.NOT_FOUND);
        }
    }
}
