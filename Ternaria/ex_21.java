package CondicionalTernaria;

import java.util.Scanner;

public class ex_21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = scanner.nextInt();

        System.out.println((num >= 1 && num <= 100) ? "Dentro do intervalo" : "Fora do intervalo");
        scanner.close();
    }
}
