package DoWhile;

import java.util.Scanner;

public class ex_16 {
    /*Exiba os primeiros 10 múltiplos de um número informado pelo usuário usando do while.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String palavra = sc.next();
        int i = 0;
        do {
            System.out.println(palavra.charAt(i));
            i++;
        }while(i< palavra.length());
    }
}
