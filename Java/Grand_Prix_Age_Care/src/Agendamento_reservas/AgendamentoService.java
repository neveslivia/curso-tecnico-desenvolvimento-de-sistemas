package Agendamento_reservas;

import Agendamento_reservas.Agendamento;
import BancoDeDadosProfisisonais.BancoDadosProfissionais;
import Cadastros.CadastroCliente;
import Cadastros.CadastroProfissional;

import java.util.ArrayList;
import java.util.List;

public class AgendamentoService {
    private BancoDadosProfissionais bancoDadosProfissionais;  // Banco de profissionais (cuidadores)
    private CadastroCliente pacienteFixo;  // Referência ao paciente fixo
    private List<Agendamento> agendamentos = new ArrayList<>();
    private int idAgendamento = 1;

    // Construtor que recebe o BancoDadosProfissionais
    public AgendamentoService(BancoDadosProfissionais bancoDadosProfissionais) {
        this.bancoDadosProfissionais = bancoDadosProfissionais;
    }

    // Método para agendar atendimento
    public void agendarAtendimento(String data, int cuidadorId) {
        // Busca o profissional (cuidador) pelo ID no banco de dados
        CadastroProfissional profissional = bancoDadosProfissionais.buscarProfissionalPorId(cuidadorId);

        if (profissional == null) {
            System.out.println("❌ ERRO: Cuidador não encontrado!");
            return;
        }

        // Criação do agendamento
        Agendamento agendamento = new Agendamento(idAgendamento++, data, profissional, pacienteFixo);
        agendamentos.add(agendamento);
        System.out.println("✅ Atendimento agendado com sucesso!");
    }

    // Método para listar os agendamentos
    public void listarAgendamentos() {
        if (agendamentos.isEmpty()) {
            System.out.println("Nenhum agendamento encontrado.");
            return;
        }

        for (Agendamento agendamento : agendamentos) {
            // Exibe o nome do paciente e do cuidador usando os métodos correspondentes
            String nomePaciente = (agendamento.getPaciente() != null) ? agendamento.getPaciente().getNome() : "Paciente não definido";
            String nomeCuidador = (agendamento.getCuidador() != null) ? agendamento.getCuidador().getNome() : "Cuidador não definido";

            System.out.println("ID: " + agendamento.getId() +
                    ", Data: " + agendamento.getData() +
                    ", Cuidador: " + nomeCuidador +
                    ", Paciente: " + nomePaciente);
        }
    }
}
