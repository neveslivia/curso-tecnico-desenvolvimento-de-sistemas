package RevisaoBasicos;

import java.util.Scanner;

public class PositivoNegativo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int num = sc.nextInt();

        if(num < 0) {
            System.out.println("O número é negativo!");

        }else {
            System.out.println("O número é positivo ");
        }
        sc.close();


    }
}
