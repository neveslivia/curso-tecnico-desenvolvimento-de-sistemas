package DoWhile;

import java.util.Scanner;

public class ex_2 {
    public static void main(String[] args) {
        /* Solicite números ao usuário e some-os até que o usuário digite zero.
         */
        Scanner sc = new Scanner(System.in);
        int num;
        int soma = 0;
        do{
            System.out.println("Digite um número: ");
            num = sc.nextInt();
            soma += num;

        }while (num !=0);
        System.out.println("A soma dos números digitados é : " + soma);
        sc.close();
    }
}
