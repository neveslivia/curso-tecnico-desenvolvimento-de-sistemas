package CondicionalTernaria;

import java.util.Scanner;

public class ex_17 {
    public static void main(String[] args) {
        /*Verifique se uma pessoa está qualificada para um desconto. O desconto é
concedido para pessoas com mais de 60 anos ou estudantes.*/
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = scanner.nextInt();

        System.out.println(num > 0 ? "Positivo" : (num < 0 ? "Negativo" : "Zero"));
        scanner.close();
    }
}
