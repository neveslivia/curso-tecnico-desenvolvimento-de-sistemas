package DoWhile;

import java.util.Scanner;

public class ex_9 {
    /*Solicite números ao usuário e exiba apenas os positivos, parando quando for negativo.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.println("Digite um número: ");
             num = sc.nextInt();
             if (num > 0){
                 System.out.println(num);
             }


        }while(num > 0);
        sc.close();
    }
}
