package CriacaodeMetodos;

import java.util.Scanner;

public class Intervalo0a50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int num = sc.nextInt();

        boolean intervalo = numero(num);

        showResult(intervalo);

        sc.close();
    }

    public static boolean numero(int number) {
        return number >= 0 && number <= 50;
    }

    public static void showResult(boolean intervalo) {
        if (intervalo) {
            System.out.println("O número está no intervalo de 0 a 50.");
        } else {
            System.out.println("O número está fora do intervalo de 0 a 50.");
        }
    }
}
