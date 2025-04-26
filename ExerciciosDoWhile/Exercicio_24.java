package DoWhile;

import java.util.Scanner;

public class ex_24 {
    /*Solicite um número ao usuário e exiba sua raiz quadrada, repetindo até que o número informado seja negativo.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num;
        do {
            System.out.println("Digite um número: ");
            num = sc.nextDouble();
            System.out.println(Math.sqrt(num));

        }while(num < 0);
    }

}
