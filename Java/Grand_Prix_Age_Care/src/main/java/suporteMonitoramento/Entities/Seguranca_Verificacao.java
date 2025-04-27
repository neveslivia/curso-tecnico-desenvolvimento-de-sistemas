package main.java.suporteMonitoramento.Entities;

import Cadastros.Cadastro;

import java.util.Random;

public class Seguranca_Verificacao {
    private Cadastro usuario;

    public Seguranca_Verificacao(Cadastro usuario) {
        this.usuario = usuario;
    }

    public Cadastro getUsuario() {
        return usuario;
    }

    public void setUsuario(Cadastro usuario) {
        this.usuario = usuario;
    }

    public boolean verificar_senha_email(String email_, String senha_) {
        return email_.equals(usuario.getEmail()) && senha_.equals(usuario.getSenha());
    }

    public String gerarToken() {
        Random random = new Random();
        int token = random.nextInt(999999);
        return String.format("%06d", token);
    }
}
