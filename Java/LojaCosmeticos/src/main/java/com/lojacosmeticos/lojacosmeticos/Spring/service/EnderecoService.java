package com.lojacosmeticos.lojacosmeticos.Spring.service;

import com.lojacosmeticos.lojacosmeticos.Spring.model.Endereco;
import com.lojacosmeticos.lojacosmeticos.Spring.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EnderecoService {
    @Autowired
    private EnderecoRepository enderecoRepository;

    public List<Endereco> listarTodosEnderecos() {
        return enderecoRepository.findAll();
    }

    public Optional<Endereco> buscarEnderecoPorId(Long id) {
        return enderecoRepository.findById(id);
    }

    public Endereco criarEndereco(Endereco endereco) {

        if (endereco.getRua() == null || endereco.getBairro() == null || endereco.getCidade() == null || endereco.getEstado() == null || endereco.getCep() == null) {
            throw new IllegalArgumentException("Nenhum campo pode ser nulo.");
        }

        return enderecoRepository.save(endereco);
    }

    public Endereco atualizarEndereco(Long id, Endereco enderecoAtualizado) {
        Optional<Endereco> enderecoExistente = enderecoRepository.findById(id);
        if (!enderecoExistente.isPresent()) {
            throw new IllegalArgumentException("Endereço não encontrado.");
        }

        Endereco endereco = enderecoExistente.get();

        if (enderecoAtualizado.getRua() == null || enderecoAtualizado.getBairro() == null || enderecoAtualizado.getCidade() == null || enderecoAtualizado.getEstado() == null || enderecoAtualizado.getCep() == null) {
            throw new IllegalArgumentException("Nenhum campo pode ser nulo.");
        }

        endereco.setRua(enderecoAtualizado.getRua());
        endereco.setNumero(enderecoAtualizado.getNumero());
        endereco.setBairro(enderecoAtualizado.getBairro());
        endereco.setCidade(enderecoAtualizado.getCidade());
        endereco.setEstado(enderecoAtualizado.getEstado());
        endereco.setCep(enderecoAtualizado.getCep());

        return enderecoRepository.save(endereco);
    }

    public void deletarEndereco(Long id) {
        Optional<Endereco> endereco = enderecoRepository.findById(id);

        if (endereco.isPresent()) {
            enderecoRepository.deleteById(id);
        } else {
            throw new IllegalArgumentException("Endereço não encontrado.");
        }
    }
}
