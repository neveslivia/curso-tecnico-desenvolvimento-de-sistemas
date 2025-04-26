package RevisaoBasicos;

import java.util.Scanner;

public class VerificaVogal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma letra: ");
        char let;
        let = sc.next().charAt(0);

        if((let == 'A') | (let == 'E') | (let == 'I' ) | (let == 'O') | (let == 'U')){
            System.out.println("É uma vogal!");

        }else{
            System.out.println("Não é uma vogal!");
        }
        sc.close();

    }
}
