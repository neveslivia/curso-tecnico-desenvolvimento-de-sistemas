package CondicionalTernaria;

import java.util.Scanner;

public class ex_27 {
    public static void main(String[] args) {
        /*Crie uma expressão ternária que retorne &quot;Positivo ou Zero&quot; se um número for maior
ou igual a 0, e &quot;Negativo&quot; caso contrário.*/
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        scanner.close();

        String resultado = (numero >= 0) ? "Positivo ou Zero" : "Negativo";
        System.out.println(resultado);
    }
}
