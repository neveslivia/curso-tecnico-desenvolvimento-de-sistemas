package DecisoesFinanceiras;

import java.util.Scanner;

public class Desconto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o saldo da conta: ");
        double saldo = sc.nextDouble();
        System.out.println("Digite o valor do saque: ");
        double saque = sc.nextDouble();

        if (saldo >= saque) {
            System.out.println("Saque aprovado.");
        } else {
            System.out.println("Saldo insuficiente.");
        }
        sc.close();
    }
}
