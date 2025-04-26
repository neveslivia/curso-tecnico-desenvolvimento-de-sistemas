package aplication;

import entities.ReceberNotas;

import java.util.Locale;
import java.util.Scanner;

public class ProgramReceberNotas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite três notas: ");
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();

        ReceberNotas receber = new ReceberNotas(n1,n2,n3);

        System.out.println(receber);

    }
}
