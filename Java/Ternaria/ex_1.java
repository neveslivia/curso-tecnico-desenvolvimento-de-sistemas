package CondicionalTernaria;

import java.util.Scanner;

public class ex_1 {
    public static void main(String[] args) {
        /*Escreva uma expressão ternária que retorne &quot;Par&quot; se um número for par e &quot;Ímpar&quot;
se for ímpar.*/
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = scanner.nextInt();

        String resultado = (num % 2 == 0) ? "Par" : "Ímpar";
        System.out.println("O número é " + resultado);

        scanner.close();
    }
}
