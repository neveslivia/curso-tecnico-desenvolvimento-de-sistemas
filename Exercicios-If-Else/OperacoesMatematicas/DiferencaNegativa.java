package OperacoesMatematicas;

import java.util.Scanner;

public class DiferencaNegativa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número inteiro:");
        int num1 = sc.nextInt();
        System.out.println("Digite outro número inteiro:");
        int num2 = sc.nextInt();

        int diferenca = num1 - num2;

        if (diferenca < 0){
            System.out.println("A diferença entre os números é negativa!");
        }else{
            System.out.println("A diferença entre os números é positiva!");
        }
    }
}
