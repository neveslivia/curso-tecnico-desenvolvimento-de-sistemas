package CondicionalTernaria;

import java.util.Scanner;

public class ex_25 {
    public static void main(String[] args) {
        /*Escreva uma expressão ternária que retorne &quot;Dia útil&quot; para os dias de segunda a
sexta-feira e &quot;Final de semana&quot; para sábado e domingo.*/
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = scanner.nextInt();

        System.out.println((num % 7 == 0) ? "Sim" : "Não");
        scanner.close();
    }
}
