package DesafioseJogos;

import java.util.Scanner;

public class DobroMaior {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int num1 = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        int num2 = sc.nextInt();

        if (num1 > 2 * num2) {
            System.out.println(num1 + " é maior que o dobro de " + num2);
        } else {
            System.out.println(num1 + " não é maior que o dobro de " + num2);
        }
        sc.close();
    }
}
