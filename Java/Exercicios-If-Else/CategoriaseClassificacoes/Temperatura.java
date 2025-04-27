package CategoriaseClassificacoes;

import java.util.Locale;
import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) .useLocale(Locale.US);
        System.out.println("Digite a temperatura em Celsius: ");
        double temperatura = sc.nextDouble();

        if (temperatura < 15) {
            System.out.println("Está frio.");
        } else if (temperatura >= 15 && temperatura <= 25) {
            System.out.println("Está agradável.");
        } else {
            System.out.println("Está quente.");
        }
        sc.close();
    }
}
