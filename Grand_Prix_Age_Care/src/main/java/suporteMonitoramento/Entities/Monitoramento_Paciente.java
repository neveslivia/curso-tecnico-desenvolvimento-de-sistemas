package main.java.suporteMonitoramento.Entities;

public class Monitoramento_Paciente {
    private String nomePaciente;
    private int idadePaciente;
    private String horaDormir;
    private String horaAcordar;
    private String remedios;
    private String horaChecarFraldas;

    public Monitoramento_Paciente(String nomePaciente, int idadePaciente, String horaDormir, String horaAcordar, String remedios, String horaChecarFraldas) {
        this.nomePaciente = nomePaciente;
        this.idadePaciente = idadePaciente;
        this.horaDormir = horaDormir;
        this.horaAcordar = horaAcordar;
        this.remedios = remedios;
        this.horaChecarFraldas = horaChecarFraldas;
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    public int getIdadePaciente() {
        return idadePaciente;
    }

    public void setIdadePaciente(int idadePaciente) {
        this.idadePaciente = idadePaciente;
    }

    public String getHoraDormir() {
        return horaDormir;
    }

    public void setHoraDormir(String horaDormir) {
        this.horaDormir = horaDormir;
    }

    public String getHoraAcordar() {
        return horaAcordar;
    }

    public void setHoraAcordar(String horaAcordar) {
        this.horaAcordar = horaAcordar;
    }

    public String getRemedios() {
        return remedios;
    }

    public void setRemedios(String remedios) {
        this.remedios = remedios;
    }

    public String getHoraChecarFraldas() {
        return horaChecarFraldas;
    }

    public void setHoraChecarFraldas(String horaChecarFraldas) {
        this.horaChecarFraldas = horaChecarFraldas;
    }
}







