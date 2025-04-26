package DesafioseJogos;

import java.util.Random;
import java.util.Scanner;

public class Sorteio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int numeroSorteado = rand.nextInt(10) + 1;

        System.out.println("Digite um número entre 1 e 10: ");
        int tentativa = sc.nextInt();

        if (tentativa == numeroSorteado) {
            System.out.println("Parabéns! Você acertou.");
        } else {
            System.out.println("Você errou. O número sorteado era " + numeroSorteado);
        }
        sc.close();
    }
}
