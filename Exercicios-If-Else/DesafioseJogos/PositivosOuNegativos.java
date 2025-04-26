package DesafioseJogos;

import java.util.Scanner;

public class PositivosOuNegativos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int num1 = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        int num2 = sc.nextInt();

        if (num1 >= 0 && num2 >= 0) {
            System.out.println("Ambos são positivos.");
        } else if (num1 < 0 && num2 < 0) {
            System.out.println("Ambos são negativos.");
        } else {
            System.out.println("Um é positivo e o outro é negativo.");
        }
        sc.close();
    }
}
