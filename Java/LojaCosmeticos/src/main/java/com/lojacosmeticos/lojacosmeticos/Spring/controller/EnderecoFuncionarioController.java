package com.lojacosmeticos.lojacosmeticos.Spring.controller;

import com.lojacosmeticos.lojacosmeticos.Spring.model.EnderecoFuncionario;
import com.lojacosmeticos.lojacosmeticos.Spring.service.EnderecoFuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/endereco-funcionario")
public class EnderecoFuncionarioController {
    @Autowired
    private EnderecoFuncionarioService enderecoFuncionarioService;

    @PostMapping
    public ResponseEntity<EnderecoFuncionario> salvarEnderecoFuncionario(@RequestBody EnderecoFuncionario enderecoFuncionario) {
        try {
            EnderecoFuncionario enderecoSalvo = enderecoFuncionarioService.salvarEnderecoFuncionario(enderecoFuncionario);
            return new ResponseEntity<>(enderecoSalvo, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<EnderecoFuncionario> buscarEnderecoFuncionario(@PathVariable Long id) {
        try {
            EnderecoFuncionario enderecoFuncionario = enderecoFuncionarioService.buscarPorId(id);
            return new ResponseEntity<>(enderecoFuncionario, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<EnderecoFuncionario> atualizarEnderecoFuncionario(@PathVariable Long id, @RequestBody EnderecoFuncionario enderecoFuncionario) {
        try {
            EnderecoFuncionario enderecoAtualizado = enderecoFuncionarioService.atualizarEnderecoFuncionario(id, enderecoFuncionario);
            return new ResponseEntity<>(enderecoAtualizado, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> excluirEnderecoFuncionario(@PathVariable Long id) {
        try {
            enderecoFuncionarioService.excluirEnderecoFuncionario(id);
            return new ResponseEntity<>("Endereço excluído com sucesso", HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>("Erro ao excluir endereço", HttpStatus.NOT_FOUND);
        }
    }
}
