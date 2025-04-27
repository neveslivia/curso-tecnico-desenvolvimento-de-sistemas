package CondicoesString;

import java.util.Scanner;

public class Palavramais5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um palavra: ");
        String palavra = sc.nextLine();

        if (palavra.length() > 5){
            System.out.println("A palavra possui mais de 5 caracteres!");

        }else{
            System.out.println("A palavra possui menos de 5 caracteres!");
        }
        sc.close();
    }
}
