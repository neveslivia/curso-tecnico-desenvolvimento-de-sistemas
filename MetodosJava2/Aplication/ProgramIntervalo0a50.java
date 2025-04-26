package aplication;

import entities.Intervalo0a50;

import java.util.Scanner;

public class ProgramIntervalo0a50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int num = sc.nextInt();

        Intervalo0a50 intervalo = new Intervalo0a50(num);
        System.out.println(intervalo);




    }
}
