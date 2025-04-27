package CondicionalTernaria;

import java.util.Scanner;

public class ex_7 {
    public static void main(String[] args) {
        /*Verifique se um número é positivo e par ao mesmo tempo. Retorne &quot;Sim&quot; se for, e
&quot;Não&quot; caso contrário.*/
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = scanner.nextInt();

        String resultado = (num > 0 && num % 2 == 0) ? "Sim" : "Não";
        System.out.println(resultado);

        scanner.close();

    }
}
