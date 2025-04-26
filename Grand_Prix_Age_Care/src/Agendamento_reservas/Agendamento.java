package Agendamento_reservas;

import Cadastros.CadastroCliente;
import Cadastros.CadastroProfissional;

public class Agendamento {
    private int id;
    private String data;
    private CadastroProfissional cuidador;  // Mudamos para CadastroProfissional
    private CadastroCliente paciente;  // Referência ao paciente fixo

    // Construtor para o agendamento
    public Agendamento(int id, String data, CadastroProfissional cuidador, CadastroCliente paciente) {
        this.id = id;
        this.data = data;
        this.cuidador = cuidador;
        this.paciente = paciente;
    }

    // Getters para acessar os dados
    public int getId() {
        return id;
    }

    public String getData() {
        return data;
    }

    public CadastroProfissional getCuidador() {
        return cuidador;
    }

    public CadastroCliente getPaciente() {
        return paciente;
    }
}
