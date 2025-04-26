package DesafioseJogos;

import java.util.Scanner;

public class Autenticacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String usuarioCorreto = "admin";
        String senhaCorreta = "senha123";

        System.out.println("Digite o usuário: ");
        String usuario = sc.next();
        System.out.println("Digite a senha: ");
        String senha = sc.next();

        if (usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {
            System.out.println("Acesso permitido.");
        } else {
            System.out.println("Usuário ou senha incorretos.");
        }
        sc.close();
    }
}
