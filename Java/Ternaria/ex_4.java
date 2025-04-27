package CondicionalTernaria;

import java.util.Scanner;

public class ex_4 {
    public static void main(String[] args) {
        /*Verifique se um número é múltiplo de 5. Se for, retorne &quot;Múltiplo de 5&quot;, caso
contrário, retorne &quot;Não é múltiplo de 5&quot;.*/
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = scanner.nextInt();

        String resultado = (num % 5 == 0) ? "Múltiplo de 5" : "Não é múltiplo de 5";
        System.out.println(resultado);

        scanner.close();

    }
}
