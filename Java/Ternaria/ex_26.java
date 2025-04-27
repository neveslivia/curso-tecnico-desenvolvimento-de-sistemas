package CondicionalTernaria;

import java.util.Scanner;

public class ex_26 {
    public static void main(String[] args) {
        /*Determine se uma pessoa pode votar. A idade mínima para votar é 16 anos.*/
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();
        scanner.close();

        String resultado = (idade >= 16) ? "Pode votar" : "Não pode votar";
        System.out.println(resultado);
    }
}
