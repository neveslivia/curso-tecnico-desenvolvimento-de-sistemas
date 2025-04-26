package com.lojacosmeticos.lojacosmeticos.Spring.service;

import com.lojacosmeticos.lojacosmeticos.Spring.exception.ResourceNotFoundException;
import com.lojacosmeticos.lojacosmeticos.Spring.model.Servicos;
import com.lojacosmeticos.lojacosmeticos.Spring.repository.ServicosRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicosService {
    private final ServicosRepository repository;

    public ServicosService(ServicosRepository repository) {
        this.repository = repository;
    }

    public List<Servicos> listarServicos() {
        return repository.findAll();
    }

    public Servicos buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Serviço não encontrado com ID: " + id));
    }

    public Servicos salvarServico(Servicos servico) {
        return repository.save(servico);
    }

    public Servicos atualizarServico(Long id, Servicos novoServico) {
        Servicos existente = buscarPorId(id);
        existente.setNomeServico(novoServico.getNomeServico());
        existente.setPrecoServico(novoServico.getPrecoServico());
        existente.setDuracaoEstimada(novoServico.getDuracaoEstimada());
        return repository.save(existente);
    }

    public void deletarServico(Long id) {
        Servicos servico = buscarPorId(id);
        repository.delete(servico);
    }
}
