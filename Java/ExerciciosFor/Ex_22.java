package ExerciciosFor;

import java.util.Scanner;

public class Ex_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = sc.nextInt();
        for (int i = 1; i<= num ; i++){
            if (num % i == 0){
                System.out.println( i );
            }
    }

    }
}
