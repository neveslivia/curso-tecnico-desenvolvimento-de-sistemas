package com.lojacosmeticos.lojacosmeticos.Spring.service;

import com.lojacosmeticos.lojacosmeticos.Spring.model.EnderecoFuncionario;
import com.lojacosmeticos.lojacosmeticos.Spring.model.Funcionario;
import com.lojacosmeticos.lojacosmeticos.Spring.repository.EnderecoFuncionarioRepository;
import com.lojacosmeticos.lojacosmeticos.Spring.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EnderecoFuncionarioService {
    @Autowired
    private EnderecoFuncionarioRepository enderecoFuncionarioRepository;

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    public EnderecoFuncionario salvarEnderecoFuncionario(EnderecoFuncionario enderecoFuncionario) {
        Optional<Funcionario> funcionarioOpt = funcionarioRepository.findById(enderecoFuncionario.getFuncionario().getId());
        if (funcionarioOpt.isEmpty()) {
            throw new RuntimeException("Funcionário não encontrado.");
        }
        return enderecoFuncionarioRepository.save(enderecoFuncionario);
    }

    public EnderecoFuncionario buscarPorId(Long id) {
        return enderecoFuncionarioRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Endereço de funcionário não encontrado."));
    }

    public EnderecoFuncionario atualizarEnderecoFuncionario(Long id, EnderecoFuncionario enderecoFuncionario) {
        EnderecoFuncionario enderecoExistente = buscarPorId(id);

        Optional<Funcionario> funcionarioOpt = funcionarioRepository.findById(enderecoFuncionario.getFuncionario().getId());
        if (funcionarioOpt.isEmpty()) {
            throw new RuntimeException("Funcionário não encontrado.");
        }

        enderecoExistente.setRua(enderecoFuncionario.getRua());
        enderecoExistente.setNumero(enderecoFuncionario.getNumero());
        enderecoExistente.setBairro(enderecoFuncionario.getBairro());
        enderecoExistente.setCidade(enderecoFuncionario.getCidade());
        enderecoExistente.setEstado(enderecoFuncionario.getEstado());
        enderecoExistente.setCep(enderecoFuncionario.getCep());
        enderecoExistente.setFuncionario(enderecoFuncionario.getFuncionario());

        return enderecoFuncionarioRepository.save(enderecoExistente);
    }

    public void excluirEnderecoFuncionario(Long id) {
        EnderecoFuncionario enderecoExistente = buscarPorId(id);

        enderecoFuncionarioRepository.delete(enderecoExistente);
    }

}
