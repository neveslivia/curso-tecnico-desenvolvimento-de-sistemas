package com.lojacosmeticos.lojacosmeticos.Spring.service;

import com.lojacosmeticos.lojacosmeticos.Spring.exception.ResourceNotFoundException;
import com.lojacosmeticos.lojacosmeticos.Spring.model.EnderecoFornecedor;
import com.lojacosmeticos.lojacosmeticos.Spring.repository.EnderecoFornecedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnderecoFornecedorService {
    @Autowired
    private EnderecoFornecedorRepository enderecoFornecedorRepository;

    public List<EnderecoFornecedor> listarTodos() {
        return enderecoFornecedorRepository.findAll();
    }

    public EnderecoFornecedor buscarPorId(Long id) {
        return enderecoFornecedorRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Endereço do Fornecedor não encontrado com o ID: " + id));
    }

    public EnderecoFornecedor salvarEndereco(EnderecoFornecedor enderecoFornecedor) {
        return enderecoFornecedorRepository.save(enderecoFornecedor);
    }

    public EnderecoFornecedor atualizarEndereco(Long id, EnderecoFornecedor enderecoAtualizado) {
        EnderecoFornecedor enderecoExistente = buscarPorId(id);

        enderecoExistente.setRua(enderecoAtualizado.getRua());
        enderecoExistente.setBairro(enderecoAtualizado.getBairro());
        enderecoExistente.setCidade(enderecoAtualizado.getCidade());
        enderecoExistente.setEstado(enderecoAtualizado.getEstado());
        enderecoExistente.setCep(enderecoAtualizado.getCep());
        enderecoExistente.setFornecedor(enderecoAtualizado.getFornecedor());

        return enderecoFornecedorRepository.save(enderecoExistente);
    }

    public void deletarEndereco(Long id) {
        EnderecoFornecedor endereco = buscarPorId(id);
        enderecoFornecedorRepository.delete(endereco);
    }
}
