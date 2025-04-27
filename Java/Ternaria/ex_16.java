package CondicionalTernaria;

import java.util.Scanner;

public class ex_16 {
    public static void main(String[] args) {
        /*Escreva uma expressão ternária que converta um valor booleano true para &quot;Sim&quot; e
false para &quot;Não&quot;.*/
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = scanner.nextInt();

        boolean primo = num > 1;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            primo = (num % i == 0) ? false : primo;
        }

        System.out.println(primo ? "Primo" : "Não Primo");
        scanner.close();
    }
}
