package CondicionalTernaria;

import java.util.Scanner;

public class ex_2 {
    public static void main(String[] args) {
        /*Escreva uma expressão ternária que retorne &quot;Maior de idade&quot; se a idade for maior
ou igual a 18 e &quot;Menor de idade&quot; caso contrário.*/
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();

        String resultado = (idade >= 18) ? "Maior de idade" : "Menor de idade";
        System.out.println(resultado);

        scanner.close();

    }
}
