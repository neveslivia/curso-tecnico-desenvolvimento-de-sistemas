package OperacoesMatematicas;

import java.util.Scanner;

public class SomamaiorQue100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número inteiro:");
        int num1 = sc.nextInt();
        System.out.println("Digite outro número inteiro:");
        int num2 = sc.nextInt();

        int soma = num1 + num2;

        if(soma> 100){
            System.out.println("A soma dos números é maior que 100!");

        }else{
            System.out.println("A soma dos números é menor que 100!");
        }
    }
}
