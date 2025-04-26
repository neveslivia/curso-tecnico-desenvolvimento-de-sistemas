package DoWhile;

import java.util.Scanner;

public class ex_10 {
    /*Conte e exiba quantos números foram digitados antes de o usuário digitar zero.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qte =0;
        int num;
        do {
            System.out.println("Digite um número: ");
            num = sc.nextInt();
            qte++;

        }while(num !=0);
        int digitados= qte -1;
    System.out.println("A quantidade de números digitados foi: " + digitados);


    }
}
