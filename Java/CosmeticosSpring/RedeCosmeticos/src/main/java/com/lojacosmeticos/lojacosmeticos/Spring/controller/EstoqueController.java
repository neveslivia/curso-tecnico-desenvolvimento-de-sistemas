package com.lojacosmeticos.lojacosmeticos.Spring.controller;

import com.lojacosmeticos.lojacosmeticos.Spring.dto.EstoqueDTO;
import com.lojacosmeticos.lojacosmeticos.Spring.dto.ProdutoDTO;
import com.lojacosmeticos.lojacosmeticos.Spring.model.Estoque;
import com.lojacosmeticos.lojacosmeticos.Spring.repository.EstoqueRepository;
import com.lojacosmeticos.lojacosmeticos.Spring.service.EstoqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/estoque")
public class EstoqueController {

    @Autowired
    private EstoqueService estoqueService;

    private EstoqueRepository estoqueRepository;

    @PostMapping
    public ResponseEntity<Estoque> criarEstoque(@RequestBody Estoque estoque) {
        try {
            Estoque novoEstoque = estoqueService.salvarEstoque(estoque);
            return new ResponseEntity<>(novoEstoque, HttpStatus.CREATED);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Estoque> buscarPorId(@PathVariable Long id) {
        try {
            Estoque estoque = estoqueService.buscarPorId(id);
            return new ResponseEntity<>(estoque, HttpStatus.OK);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/estoque")
    public List<EstoqueDTO> listarEstoque() {
        List<Estoque> estoques = estoqueRepository.findAll();

        return estoques.stream().map(estoque -> new EstoqueDTO(
                estoque.getId(),
                new ProdutoDTO(estoque.getProduto().getId(), estoque.getProduto().getNomeProduto(),
                        estoque.getProduto().getDescricao(), estoque.getProduto().getPrecoProduto()),
                estoque.getCategoriaProduto().name(),
                estoque.getQuantidadeAtual()
        )).collect(Collectors.toList());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Estoque> atualizarEstoque(@PathVariable Long id, @RequestBody Estoque estoque) {
        try {
            Estoque atualizado = estoqueService.atualizarEstoque(id, estoque);
            return new ResponseEntity<>(atualizado, HttpStatus.OK);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletarEstoque(@PathVariable Long id) {
        try {
            estoqueService.excluirEstoque(id);
            return new ResponseEntity<>("Estoque removido com sucesso!", HttpStatus.NO_CONTENT);
        } catch (RuntimeException e) {
            return new ResponseEntity<>("Estoque não encontrado.", HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/{id}/adicionar")
    public ResponseEntity<Estoque> adicionarQuantidade(@PathVariable Long id, @RequestParam Integer quantidade) {
        try {
            Estoque atualizado = estoqueService.adicionarQuantidade(id, quantidade);
            return new ResponseEntity<>(atualizado, HttpStatus.OK);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping("/{id}/reduzir")
    public ResponseEntity<Estoque> reduzirQuantidade(@PathVariable Long id, @RequestParam Integer quantidade) {
        try {
            Estoque atualizado = estoqueService.reduzirQuantidade(id, quantidade);
            return new ResponseEntity<>(atualizado, HttpStatus.OK);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }

}
