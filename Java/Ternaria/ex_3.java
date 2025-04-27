package CondicionalTernaria;

import java.util.Scanner;

public class ex_3 {
    public static void main(String[] args) {
        /*Escreva uma expressão ternária que retorne &quot;Positivo&quot; se um número for maior que
zero, &quot;Negativo&quot; se menor que zero, e &quot;Zero&quot; se for igual a zero.*/
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = scanner.nextInt();

        String resultado = (num > 0) ? "Positivo" : (num < 0) ? "Negativo" : "Zero";
        System.out.println(resultado);

        scanner.close();

    }
}
