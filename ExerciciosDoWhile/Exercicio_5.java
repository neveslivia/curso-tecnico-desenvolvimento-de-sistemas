package DoWhile;

import java.util.Scanner;

public class ex_5 {
    /*Exiba a tabuada do número informado pelo usuário usando do while.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int num = sc.nextInt();
        int mult;
        int num2 = 1;
        do {
            mult = num * num2;
            System.out.println( num + " x " + num2 + " = " + mult);
            num2 ++;

        }while(num2 <= 10);
        sc.close();
    }
}
