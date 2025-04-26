package CondicionalTernaria;

import java.util.Scanner;

public class ex_29 {
    public static void main(String[] args) {
        /*Escreva uma expressão ternária que retorne &quot;Adulto&quot; se a idade estiver entre 18 e
60, &quot;Idoso&quot; se for maior que 60 e &quot;Jovem&quot; caso contrário.*/
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();
        scanner.close();

        String categoria = (idade >= 18 && idade <= 60) ? "Adulto" : (idade > 60) ? "Idoso" : "Jovem";
        System.out.println(categoria);
    }
}
