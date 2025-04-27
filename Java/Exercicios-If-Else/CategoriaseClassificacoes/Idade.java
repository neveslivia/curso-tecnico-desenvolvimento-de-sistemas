package CategoriaseClassificacoes;

import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();

        if (idade> 0 && idade <= 12){
            System.out.println("Você é uma criança!");
        } else if (idade > 12 && idade<= 17 ) {
            System.out.println("Você é adolescente!");
        }else if (idade > 65){
            System.out.println("Você é idoso(A)");
        }
        sc.close();
    }
}
