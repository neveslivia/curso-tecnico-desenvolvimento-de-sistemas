package DoWhile;

import java.util.Scanner;

public class ex_1 {
    public static void main(String[] args) {
        /* Peça para o usuário digitar um número e continue pedindo até que ele informe um número negativo.
         */
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.println("Digite um número:");
            num = sc.nextInt();

        } while (num > 0);
        sc.close();
    }
}
