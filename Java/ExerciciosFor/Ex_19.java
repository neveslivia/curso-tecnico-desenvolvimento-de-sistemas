package ExerciciosFor;

import java.util.Scanner;

public class Ex_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = sc.nextInt();
        String a = Integer.toString(num);
        for (int i = 0; i <= a.length(); i++){
            System.out.println(a.charAt(i));
        }
    }
}
