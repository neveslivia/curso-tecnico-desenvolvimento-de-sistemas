package com.lojacosmeticos.lojacosmeticos.Spring.service;

import com.lojacosmeticos.lojacosmeticos.Spring.exception.ResourceNotFoundException;
import com.lojacosmeticos.lojacosmeticos.Spring.model.Vendas;
import com.lojacosmeticos.lojacosmeticos.Spring.repository.VendasRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VendasService {
    private final VendasRepository repository;

    public VendasService(VendasRepository repository) {
        this.repository = repository;
    }

    public List<Vendas> listarVendas() {
        return repository.findAll();
    }

    public Vendas buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Venda não encontrada com ID: " + id));
    }

    public Vendas salvarVenda(Vendas venda) {
        return repository.save(venda);
    }

    public Vendas atualizarVenda(Long id, Vendas novaVenda) {
        Vendas existente = buscarPorId(id);
        existente.setDataVenda(novaVenda.getDataVenda());
        existente.setFuncionario(novaVenda.getFuncionario());
        existente.setTotal(novaVenda.getTotal());
        return repository.save(existente);
    }

    public void deletarVenda(Long id) {
        Vendas venda = buscarPorId(id);
        repository.delete(venda);
    }
}
