package RevisaoBasicos;

import java.util.Scanner;

public class IdadeVotacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a sua idade: ");
        int idade = sc.nextInt();

        if(idade< 16){
            System.out.println("Você ainda não pode votar!");
        }else{
            System.out.println("Você já pode votar!");
        }
        sc.close();
    }
}
