package DesafioseJogos;

import java.util.Scanner;

public class CodigoAcesso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int codigoCorreto = 1234;

        System.out.println("Digite o código de acesso: ");
        int codigoDigitado = sc.nextInt();

        if (codigoDigitado == codigoCorreto) {
            System.out.println("Acesso permitido.");
        } else {
            System.out.println("Acesso negado.");
        }
        sc.close();
    }
}
