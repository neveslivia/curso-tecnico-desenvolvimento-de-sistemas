package DoWhile;

import java.util.Scanner;

public class ex_17 {
    /*Verifique se um número informado pelo usuário é primo usando do while.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = sc.nextInt();
        int i = 2;
        do{
            if (num % i ==0){

            }
            i++;


        }while (i< num);
        if (i ==0){
            System.out.println("O número é primo!");
        }else{
            System.out.println("O número não é primo!");
        }
    }

}
