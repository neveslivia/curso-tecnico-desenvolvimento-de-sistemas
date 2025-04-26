package DecisoesFinanceiras;

import java.util.Scanner;

public class Fiananciamento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o salário da pessoa: ");
        double salario = sc.nextDouble();

        if (salario >= 3000) {
            System.out.println("Financiamento aprovado.");
        } else {
            System.out.println("Financiamento negado.");
        }
        sc.close();
    }
}
