package programs;

import entities.ContaBancaria;

import java.util.Scanner;

public class ProgramContaBancaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContaBancaria contaBancaria = new ContaBancaria();
        System.out.println("Digite o nome do titular da conta: ");
        contaBancaria.setTitular(sc.next());
        System.out.println("Digite o valor inicial da conta: ");
        contaBancaria.setSaldo(sc.nextDouble());
        System.out.println("Digite o valor do depósito que deseja fazer: ");
        contaBancaria.deposito(sc.nextDouble());
        System.out.println("Digite o valor do saque que deseja fazer: ");
        contaBancaria.saque(sc.nextDouble());
        System.out.println(contaBancaria);



    }
}
