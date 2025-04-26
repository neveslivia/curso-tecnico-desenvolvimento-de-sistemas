package DesafioseJogos;

import java.util.Scanner;

public class DoacaoSangue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();
        System.out.println("Digite seu peso (kg): ");
        double peso = sc.nextDouble();

        if (idade >= 18 && idade <= 65 && peso >= 50) {
            System.out.println("Você está apto para doar sangue.");
        } else {
            System.out.println("Você não está apto para doar sangue.");
        }
        sc.close();
    }
}
