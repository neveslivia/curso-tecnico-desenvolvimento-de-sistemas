package ExerciciosFor;

import java.util.Scanner;

public class Ex_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número inteiro para saber sua tabuada: ");
        int num = sc.nextInt();
        int resultado;
        for (int i = 1; i<=10; i++){
            resultado = num * i;
            System.out.println(num + " x " + i + " = " + resultado);
        }
        sc.close();
    }
}
