package com.lojacosmeticos.lojacosmeticos.Spring.service;

import com.lojacosmeticos.lojacosmeticos.Spring.exception.RecursoNaoEncontradoException;
import com.lojacosmeticos.lojacosmeticos.Spring.model.Agendamento;
import com.lojacosmeticos.lojacosmeticos.Spring.model.Funcionario;
import com.lojacosmeticos.lojacosmeticos.Spring.repository.AgendamentoRepository;
import com.lojacosmeticos.lojacosmeticos.Spring.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgendamentoService {
    @Autowired
    private final AgendamentoRepository agendamentoRepository;
    private final FuncionarioRepository funcionarioRepository;

    public AgendamentoService(AgendamentoRepository agendamentoRepository, FuncionarioRepository funcionarioRepository) {
        this.agendamentoRepository = agendamentoRepository;
        this.funcionarioRepository = funcionarioRepository;
    }

    public Agendamento salvarAgendamento(Agendamento agendamento) {
        try {
            Long funcionarioId = agendamento.getFuncionario().getId();

            Funcionario funcionario = funcionarioRepository.findById(funcionarioId)
                    .orElseThrow(() -> new RecursoNaoEncontradoException("Funcionário com ID " + funcionarioId + " não encontrado!"));

            agendamento.setFuncionario(funcionario);

            return agendamentoRepository.save(agendamento);
        } catch (Exception e) {
            throw new RuntimeException("Erro ao salvar o agendamento: " + e.getMessage());
        }
    }

    public List<Agendamento> listarTodos() {
        try {
            return agendamentoRepository.findAll();
        } catch (Exception e) {
            throw new RuntimeException("Erro ao listar os agendamentos: " + e.getMessage());
        }
    }

    public Agendamento buscarPorId(Long id) {
        try {
            return agendamentoRepository.findById(id)
                    .orElseThrow(() -> new RecursoNaoEncontradoException("Agendamento com ID " + id + " não encontrado!"));
        } catch (Exception e) {
            throw new RuntimeException("Erro ao buscar agendamento: " + e.getMessage());
        }
    }

    public void deletarAgendamento(Long id) {
        try {
            Agendamento agendamento = buscarPorId(id);
            agendamentoRepository.delete(agendamento);
        } catch (Exception e) {
            throw new RuntimeException("Erro ao deletar o agendamento: " + e.getMessage());
        }
    }
}
