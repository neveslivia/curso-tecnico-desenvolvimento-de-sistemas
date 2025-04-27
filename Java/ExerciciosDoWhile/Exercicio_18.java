package DoWhile;

import java.util.Scanner;

public class ex_18 {
    /*Solicite um número e informe se é par ou ímpar, repetindo até que seja digitado zero.
     */
    public static void main(String[] args) {
        int  num;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Digite um número: ");
            num = sc.nextInt();
            if (num % 2 ==0){
                System.out.println("O número é par!");
            }else {
                System.out.println("O número é ímpar!");
            }

        }while(num !=0);
    }
}
