package CondicionalTernaria;

import java.util.Scanner;

public class ex_9 {
    public static void main(String[] args) {
        /*Escreva uma expressão ternária que retorne &quot;Maior&quot; se um número for maior que
outro e &quot;Menor ou Igual&quot; caso contrário.*/
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        String resultado = (num1 > num2) ? "Maior" : "Menor ou Igual";
        System.out.println(resultado);

        scanner.close();

    }
}
