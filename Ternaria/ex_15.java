package CondicionalTernaria;

import java.util.Scanner;

public class ex_15 {
    public static void main(String[] args) {
        /*Verifique se um número é múltiplo de 3 e 5 ao mesmo tempo. Se for, retorne
&quot;FizzBuzz&quot;, senão retorne o próprio número.*/
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = scanner.nextInt();

        String resultado = (num % 3 == 0 && num % 5 == 0) ? "FizzBuzz" : String.valueOf(num);
        System.out.println(resultado);

        scanner.close();


    }
}
