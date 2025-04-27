package DoWhile;

import java.util.Random;

public class ex_19 {
    /*Gere uma senha aleatória de 6 caracteres usando do while.
     */
    public static void main(String[] args) {
        String senha = gerarSenha(6);
        System.out.println("Senha gerada: " + senha);
    }

    public static String gerarSenha(int tamanho) {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder senha = new StringBuilder();

        int i = 0;
        do {
            int index = random.nextInt(caracteres.length());
            senha.append(caracteres.charAt(index));
            i++;
        } while (i < tamanho);

        return senha.toString();
    }

    }

