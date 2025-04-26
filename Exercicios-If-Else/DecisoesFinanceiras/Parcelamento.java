package DecisoesFinanceiras;

import java.util.Scanner;

public class Parcelamento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o salário da pessoa: ");
        double salario = sc.nextDouble();
        System.out.println("Digite o valor da parcela: ");
        double parcela = sc.nextDouble();

        if (parcela <= salario * 0.1) {
            System.out.println("Compra parcelada aprovada.");
        } else {
            System.out.println("Compra parcelada negada.");
        }
        sc.close();
    }
}
