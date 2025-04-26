package aplication;

import entities.DiferencaNegativa;

import java.util.Locale;
import java.util.Scanner;

public class ProgramDiferencaNegativa {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite dois números inteiros: ");
        int numero1 = sc.nextInt();
        int numero2 = sc.nextInt();

        DiferencaNegativa dif = new DiferencaNegativa(numero1,numero2);
        System.out.println(dif);


    }
}
