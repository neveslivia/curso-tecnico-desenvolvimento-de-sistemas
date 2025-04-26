package CondicionalTernaria;

import java.util.Scanner;

public class ex_5 {
    public static void main(String[] args) {
        /*Crie uma expressão ternária que determine se um ano é bissexto. Considere que um
ano é bissexto se for divisível por 4 e não for divisível por 100, exceto se for divisível
por 400.*/
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um ano: ");
        int ano = scanner.nextInt();

        String resultado = (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)) ? "Bissexto" : "Não bissexto";
        System.out.println(resultado);

        scanner.close();

    }
}
