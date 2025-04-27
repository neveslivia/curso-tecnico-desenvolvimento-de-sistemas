package DesafioseJogos;

import java.util.Scanner;

public class OrdemCrescente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int num1 = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        int num2 = sc.nextInt();
        System.out.println("Digite o terceiro número: ");
        int num3 = sc.nextInt();

        int menor = Math.min(num1, Math.min(num2, num3));
        int maior = Math.max(num1, Math.max(num2, num3));
        int meio = (num1 + num2 + num3) - (menor + maior);

        System.out.println("Os números em ordem crescente: " + menor + ", " + meio + ", " + maior);
        sc.close();
    }
}
