package aplication;

import entities.OperacoesMatematicas;

import java.util.Scanner;

public class ProgramOperacoesMatematicas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite dois números inteiros: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        OperacoesMatematicas operacao = new OperacoesMatematicas(num1,num2);
        System.out.println(operacao);
    }
}
