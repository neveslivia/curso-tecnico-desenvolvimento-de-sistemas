package CondicionalTernaria;

import java.util.Scanner;

public class ex_12 {
    public static void main(String[] args) {
        /*Crie uma expressão ternária que retorne &quot;Par e Positivo&quot;, &quot;Par e Negativo&quot;, &quot;Ímpar e
Positivo&quot; ou &quot;Ímpar e Negativo&quot; com base em um número.*/
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = scanner.nextInt();

        String resultado = (num % 2 == 0) ? (num > 0 ? "Par e Positivo" : "Par e Negativo")
                : (num > 0 ? "Ímpar e Positivo" : "Ímpar e Negativo");
        System.out.println(resultado);

        scanner.close();
    }
}
