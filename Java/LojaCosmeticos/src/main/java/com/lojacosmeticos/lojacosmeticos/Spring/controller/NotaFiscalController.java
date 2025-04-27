package com.lojacosmeticos.lojacosmeticos.Spring.controller;

import com.lojacosmeticos.lojacosmeticos.Spring.model.NotaFiscal;
import com.lojacosmeticos.lojacosmeticos.Spring.service.NotaFiscalService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/nota-fiscal")
public class NotaFiscalController {
    private final NotaFiscalService notaFiscalService;

    public NotaFiscalController(NotaFiscalService notaFiscalService) {
        this.notaFiscalService = notaFiscalService;
    }

    @GetMapping
    public ResponseEntity<List<NotaFiscal>> listarTodas() {
        return ResponseEntity.ok(notaFiscalService.listarTodas());
    }

    @GetMapping("/{id}")
    public ResponseEntity<NotaFiscal> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(notaFiscalService.buscarPorId(id));
    }

    @PostMapping
    public ResponseEntity<NotaFiscal> salvar(@RequestBody NotaFiscal notaFiscal) {
        return new ResponseEntity<>(notaFiscalService.salvar(notaFiscal), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<NotaFiscal> atualizar(@PathVariable Long id, @RequestBody NotaFiscal notaFiscal) {
        return ResponseEntity.ok(notaFiscalService.atualizar(id, notaFiscal));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        notaFiscalService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
