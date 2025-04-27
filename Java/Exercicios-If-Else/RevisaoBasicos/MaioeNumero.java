package RevisaoBasicos;

import java.util.Scanner;

public class MaioeNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int num1 = sc.nextInt();
        System.out.println("Digite outro número: ");
        int num2 = sc.nextInt();

        if(num1 > num2){
            System.out.println("O número " + num1 + " é o maior!");
        }else{
            System.out.println("O número " + num2 + " é o maior!");
        }
        sc.close();
    }
}
