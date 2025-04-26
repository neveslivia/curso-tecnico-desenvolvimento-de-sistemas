package CondicionalTernaria;

import java.util.Scanner;

public class ex_24 {
    public static void main(String[] args) {
        /*Verifique se um número é perfeito (soma dos seus divisores próprios é igual ao
próprio número). Se for, retorne &quot;Perfeito&quot;, senão &quot;Não perfeito&quot;.*/
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = scanner.nextInt();

        System.out.println((num & 1) == 0 ? "Par" : "Ímpar");
        scanner.close();
    }
}
