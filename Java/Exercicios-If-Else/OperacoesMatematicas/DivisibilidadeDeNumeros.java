package OperacoesMatematicas;

import java.util.Scanner;

public class DivisibilidadeDeNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número inteiro:");
        int num1 = sc.nextInt();
        System.out.println("Digite outro número inteiro:");
        int num2 = sc.nextInt();

        if ((num1 % num2 == 0) || (num2 %  num1 ==0)){
            System.out.println("Os números são divisíveis entre si!");
        }else{
            System.out.println("Os números não são divisíveis entre si!");
        }
        sc.close();
    }
}
