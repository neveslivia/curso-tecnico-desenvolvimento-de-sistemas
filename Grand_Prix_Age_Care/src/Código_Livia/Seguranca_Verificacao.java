/*package Entities;

import java.util.Random;
import java.util.Scanner;

public class Seguranca_Verificacao {
    private Cadastro email;
    private Cadastro senha;

    public Seguranca_Verificacao(Cadastro email, Cadastro senha) {
        this.email = email;
        this.senha = senha;
    }

    public static String randomAlphanumericString(int length) {
        String alphanumericCharacters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuv";

        StringBuilder randomString = new StringBuilder(length);
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(alphanumericCharacters.length());
            char randomChar = alphanumericCharacters.charAt(randomIndex);
            randomString.append(randomChar);
        }

        return randomString.toString();
    }

    public boolean verificar_senha_email(String email_, String senha_) {
        if (email_.equals(email.getEmail()) && senha_.equals(senha.getSenha())) {
            return true;
        } else {
            return false;
        }
    }

    public boolean verificarToken(String tokenDigitado) {
        String token = randomAlphanumericString(6);
        System.out.println("Seu token gerado é: " + token);
        return token.equals(tokenDigitado);
    }

}
*/