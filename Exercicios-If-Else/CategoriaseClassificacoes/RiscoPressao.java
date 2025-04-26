package CategoriaseClassificacoes;

import java.util.Locale;
import java.util.Scanner;

public class RiscoPressao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite a pressão arterial sistólica: ");
        int sistolica = sc.nextInt();
        System.out.println("Digite a pressão arterial diastólica: ");
        int diastolica = sc.nextInt();

        if (sistolica < 120 && diastolica < 80) {
            System.out.println("Nível de risco: Normal");
        } else if ((sistolica >= 120 && sistolica < 140) || (diastolica >= 80 && diastolica < 90)) {
            System.out.println("Nível de risco: Moderado");
        } else {
            System.out.println("Nível de risco: Alto");
        }
        sc.close();
    }
}
