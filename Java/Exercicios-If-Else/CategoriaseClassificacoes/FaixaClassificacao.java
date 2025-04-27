package CategoriaseClassificacoes;

import java.util.Scanner;

public class FaixaClassificacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int num = sc.nextInt();

        if (num >=1 && num <= 10){
            System.out.println("Esse número pertence a faixa de classificação A!");

        } else if (num >= 11 && num <=20) {
            System.out.println("Esse número pertence a faixa de classificação B!");

        } else if (num >=21 && num <= 30) {
            System.out.println("Esse número pertence a faixa de classificação C!");

        }
    }
}
