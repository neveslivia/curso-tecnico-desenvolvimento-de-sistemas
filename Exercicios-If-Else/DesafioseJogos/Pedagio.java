package DesafioseJogos;

import java.util.Scanner;

public class Pedagio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o último dígito da placa do veículo: ");
        int ultimoDigito = sc.nextInt();

        if (ultimoDigito % 2 == 0) {
            System.out.println("O veículo pode passar.");
        } else {
            System.out.println("O veículo não pode passar.");
        }
        sc.close();
    }
}
