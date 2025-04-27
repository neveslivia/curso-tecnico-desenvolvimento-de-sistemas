package DoWhile;

import java.util.Scanner;

public class ex_15 {
    /*Gere a sequência de Fibonacci até um valor máximo informado pelo usuário.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Diite um número limite para que a sequência de Fibonacci seja gerada: ");
        int num = sc.nextInt();
        int a = 1;
        int i = 1;
        do {
            i = i + a;
            a = i - a;
            System.out.println(a);



        }while (i <= num);

    }
}
