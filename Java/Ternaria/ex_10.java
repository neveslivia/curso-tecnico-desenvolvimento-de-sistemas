package CondicionalTernaria;

import java.util.Scanner;

public class ex_10 {
    public static void main(String[] args) {
        /*Determine se um número é maior que 100. Se for, retorne &quot;Alto&quot;, senão, retorne
&quot;Baixo&quot;.*/
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
