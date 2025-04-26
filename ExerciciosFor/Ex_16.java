package ExerciciosFor;

import java.util.Scanner;

public class Ex_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String palavra = sc.next();
        for (int i = 0; i < palavra.length(); i++){
            System.out.println(palavra.charAt(i));
        }
        sc.close();
    }
}
