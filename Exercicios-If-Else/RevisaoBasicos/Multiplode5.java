package RevisaoBasicos;

import java.util.Scanner;

public class Multiplode5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int num = sc.nextInt();

        if(num % 5 == 0){
            System.out.println("O número é divisível por 5!");
        }else{
            System.out.println("O número não é divisível por 5!");
        }
    }
}
