package aplication;

import entities.DiferencaNegativa;

import java.util.Locale;
import java.util.Scanner;

public class ProgramDiferencaNegativa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DiferencaNegativa dif = new DiferencaNegativa();
        System.out.println("Digite dois números inteiros: ");
        dif.num1 = sc.nextInt();
        dif.num2 = sc.nextInt();

        System.out.println(dif );






    }
}
