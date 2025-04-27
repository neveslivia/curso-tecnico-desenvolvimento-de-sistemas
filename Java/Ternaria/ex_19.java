package CondicionalTernaria;

import java.util.Scanner;

public class ex_19 {
    public static void main(String[] args) {
        /*Verifique se um número é divisível por 2 ou por 3. Se for, retorne &quot;Divisível&quot;, caso
contrário, retorne &quot;Não divisível&quot;.*/
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite três números: ");
        int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt();

        int maior = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println("O maior número é: " + maior);
        scanner.close();
    }
}
