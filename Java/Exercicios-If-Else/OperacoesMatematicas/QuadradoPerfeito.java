package OperacoesMatematicas;

import java.util.Scanner;

public class QuadradoPerfeito {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = sc.nextInt();
        double sqrt = Math.ceil(Math.sqrt(num));

        if( Math.pow(sqrt,2) != num){
            System.out.println("Não é um quadrado perfeito!");

        }else{
            System.out.println("O número é um quadrado perfeito!");
        }
        sc.close();
    }
}
