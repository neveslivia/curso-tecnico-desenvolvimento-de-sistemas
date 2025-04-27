package CondicionalTernaria;

import java.util.Scanner;

public class ex_20 {
    public static void main(String[] args) {
        /*Determine se um número é par ou ímpar, e se é positivo ou negativo.*/
        /*Escreva uma expressão ternária que defina se um aluno está em &quot;Recuperação&quot;
caso a nota esteja entre 5 e 6.9, &quot;Aprovado&quot; se for maior ou igual a 7 e &quot;Reprovado&quot;
caso contrário.*/
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma letra: ");
        char letra = scanner.next().charAt(0);

        System.out.println(Character.isUpperCase(letra) ? "Maiúscula" : "Minúscula");
        scanner.close();
    }
}
