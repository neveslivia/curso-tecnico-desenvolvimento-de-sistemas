package com.lojacosmeticos.lojacosmeticos.Spring.controller;

import com.lojacosmeticos.lojacosmeticos.Spring.model.Servicos;
import com.lojacosmeticos.lojacosmeticos.Spring.service.ServicosService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/servicos")
public class ServicosController {
    private final ServicosService service;

    public ServicosController(ServicosService service) {
        this.service = service;
    }

    @GetMapping
    public List<Servicos> listarTodos() {
        return service.listarServicos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Servicos> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(service.buscarPorId(id));
    }

    @PostMapping
    public ResponseEntity<Servicos> criar(@RequestBody Servicos servico) {
        Servicos novoServico = service.salvarServico(servico);
        return ResponseEntity.ok(novoServico);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Servicos> atualizar(@PathVariable Long id, @RequestBody Servicos servicoAtualizado) {
        Servicos servico = service.atualizarServico(id, servicoAtualizado);
        return ResponseEntity.ok(servico);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        service.deletarServico(id);
        return ResponseEntity.noContent().build();
    }
}
