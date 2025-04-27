package CondicionalTernaria;

import java.util.Scanner;

public class ex_6 {
    public static void main(String[] args) {
        /*Determine se uma pessoa pode dirigir. A condição para dirigir é ter idade maior ou
igual a 18 e possuir carteira de motorista.*/
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.print("Possui carteira de motorista? (true/false): ");
        boolean temCarteira = scanner.nextBoolean();

        String resultado = (idade >= 18 && temCarteira) ? "Pode dirigir" : "Não pode dirigir";
        System.out.println(resultado);

        scanner.close();

    }
}
