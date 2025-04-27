package ExerciciosFor;

import java.util.Scanner;

public class Ex_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int num = sc.nextInt();
        int fatorial = 1;
        for (int i = 1; i <= num; i ++) {
            fatorial = fatorial *i;
        }
        sc.close();
        System.out.println("O fatorial de "+ num + " é "+ fatorial);
    }
}
