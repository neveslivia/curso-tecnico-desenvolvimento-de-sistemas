package DesafioseJogos;

import java.util.Scanner;

public class Adivinhacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroSecreto = 7;

        System.out.println("Adivinhe o número (entre 1 e 10): ");
        int tentativa = sc.nextInt();

        if (tentativa == numeroSecreto) {
            System.out.println("Parabéns! Você acertou!");
        } else {
            System.out.println("Você errou. O número era " + numeroSecreto);
        }
        sc.close();
    }
}
