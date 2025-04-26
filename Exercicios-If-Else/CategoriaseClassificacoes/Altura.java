package CategoriaseClassificacoes;

import java.util.Locale;
import java.util.Scanner;

public class Altura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite a sua altura: ");
        double altura = sc.nextDouble();
        if(altura > 1.55 && altura < 1.60 ){
            System.out.println("Você é uma pessoa baixa!");

        } else if (altura > 1.60 && altura < 1.70) {

            System.out.println("Você é uma pessoa média!");
        } else if (altura > 1.70) {
            System.out.println("Você é uma pessoa alta!");

        }
    }
}
