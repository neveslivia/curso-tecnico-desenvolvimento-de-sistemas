package CondicionalTernaria;

import java.util.Scanner;

public class ex_8 {
    public static void main(String[] args) {
        /*Escreva uma expressão ternária que retorne &quot;Aprovado&quot; se a nota for maior ou igual
a 7 e &quot;Reprovado&quot; caso contrário.*/
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota do aluno: ");
        double nota = scanner.nextDouble();

        String resultado = (nota >= 7) ? "Aprovado" : "Reprovado";
        System.out.println(resultado);

        scanner.close();

    }
}
