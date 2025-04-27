package CondicionalTernaria;

import java.util.Scanner;

public class ex_14 {

    public static void main(String[] args) {
        /*Determine se um número está entre 10 e 50 (inclusive). Se estiver, retorne &quot;Dentro
do intervalo&quot;, caso contrário, &quot;Fora do intervalo&quot;.*/
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = scanner.nextInt();

        String resultado = (num >= 10 && num <= 50) ? "Dentro do intervalo" : "Fora do intervalo";
        System.out.println(resultado);

        scanner.close();
    }
}
