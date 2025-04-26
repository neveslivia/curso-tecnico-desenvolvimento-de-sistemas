package com.lojacosmeticos.lojacosmeticos.Spring.service;


import com.lojacosmeticos.lojacosmeticos.Spring.model.Fornecedor;
import com.lojacosmeticos.lojacosmeticos.Spring.repository.FornecedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class FornecedorService {
    @Autowired
    private FornecedorRepository fornecedorRepository;

    public Fornecedor salvar(Fornecedor fornecedor) {
        return fornecedorRepository.save(fornecedor);
    }

    public List<Fornecedor> listarTodos() {
        return fornecedorRepository.findAll();
    }

    public Fornecedor buscarPorId(Long id) {
        Optional<Fornecedor> fornecedor = fornecedorRepository.findById(id);
        if (fornecedor.isPresent()) {
            return  fornecedor.get();
        } else {
            throw new RuntimeException("Fornecedor não encontrado com o id: " + id);
        }
    }


    public Fornecedor atualizar(Long id, Fornecedor fornecedorAtualizado) {
        Fornecedor fornecedorExistente = buscarPorId(id);
        fornecedorExistente.setCnpj(fornecedorAtualizado.getCnpj());
        fornecedorExistente.setRazaoSocial(fornecedorAtualizado.getRazaoSocial());
        fornecedorExistente.setNomeFantasia(fornecedorAtualizado.getNomeFantasia());
        fornecedorExistente.setEnderecoFornecedor(fornecedorAtualizado.getEnderecoFornecedor());
        fornecedorExistente.setEmail(fornecedorAtualizado.getEmail());
        fornecedorExistente.setTelefone(fornecedorAtualizado.getTelefone());

        return fornecedorRepository.save(fornecedorExistente);
    }

    public void excluir(Long id) {
        fornecedorRepository.deleteById(id);
    }
}
