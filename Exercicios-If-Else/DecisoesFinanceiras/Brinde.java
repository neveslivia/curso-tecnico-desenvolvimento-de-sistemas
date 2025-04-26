package DecisoesFinanceiras;

import java.util.Scanner;

public class Brinde {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor da compra: ");
        double valor = sc.nextDouble();

        if (valor >= 100) {
            System.out.println("Você ganhou um brinde!");
        } else {
            System.out.println("Você não ganhou um brinde.");
        }
        sc.close();
    }
}
