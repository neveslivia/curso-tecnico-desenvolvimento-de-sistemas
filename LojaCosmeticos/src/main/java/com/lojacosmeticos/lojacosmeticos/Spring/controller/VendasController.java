package com.lojacosmeticos.lojacosmeticos.Spring.controller;

import com.lojacosmeticos.lojacosmeticos.Spring.model.Vendas;
import com.lojacosmeticos.lojacosmeticos.Spring.service.VendasService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vendas")
public class VendasController {
    private final VendasService service;

    public VendasController(VendasService service) {
        this.service = service;
    }

    @GetMapping
    public List<Vendas> listarTodas() {
        return service.listarVendas();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Vendas> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(service.buscarPorId(id));
    }

    @PostMapping
    public ResponseEntity<Vendas> criar(@RequestBody Vendas venda) {
        Vendas novaVenda = service.salvarVenda(venda);
        return ResponseEntity.ok(novaVenda);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Vendas> atualizar(@PathVariable Long id, @RequestBody Vendas vendaAtualizada) {
        Vendas venda = service.atualizarVenda(id, vendaAtualizada);
        return ResponseEntity.ok(venda);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        service.deletarVenda(id);
        return ResponseEntity.noContent().build();
    }

}
