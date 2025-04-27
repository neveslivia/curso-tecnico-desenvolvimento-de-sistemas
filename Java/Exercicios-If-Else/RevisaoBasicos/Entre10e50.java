package RevisaoBasicos;

import java.util.Scanner;

public class Entre10e50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int num = sc.nextInt();

        if(num > 10 && num <50){
            System.out.println("O número informado está entre 10 e 50!");
        }else{
            System.out.println("O número indicado não está entre 10 e 50!");
        }
        sc.close();
    }
}
