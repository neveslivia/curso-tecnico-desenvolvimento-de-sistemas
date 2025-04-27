package CondicionalTernaria;

import java.util.Scanner;

public class ex_22 {
    public static void main(String[] args) {
        /*Crie uma expressão ternária que informe se um produto tem frete grátis,
considerando que o frete grátis ocorre se o valor do produto for maior ou igual a 100.*/
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um ano: ");
        int ano = scanner.nextInt();

        System.out.println(((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) ? "Bissexto" : "Não Bissexto");
        scanner.close();
    }
}
