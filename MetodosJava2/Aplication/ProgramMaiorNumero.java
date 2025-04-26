package aplication;

import entities.MaiorNumero;

import java.util.Scanner;

public class ProgramMaiorNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite três números: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        MaiorNumero maior = new MaiorNumero(n1,n2,n3);
        System.out.println(maior);











    }
}
