package DoWhile;

import java.util.Scanner;

public class ex_14 {
    /*Exiba os divisores de um número informado pelo usuário usando do while.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número para saber seus divisores: ");
        int num = sc.nextInt();
        int i = 1;
        do {
            if (num % i == 0){
                System.out.println(i);
            }
            i++;

        }while(i < num);

    }
}
