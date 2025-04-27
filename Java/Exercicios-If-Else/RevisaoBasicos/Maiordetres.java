package RevisaoBasicos;

import java.util.Scanner;

public class Maiordetres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o 1° número: ");
        int num1 = sc.nextInt();
        System.out.println("Digite o 2° número: ");
        int num2 = sc.nextInt();
        System.out.println("Digite o 3° número: ");
        int num3 = sc.nextInt();

        if(num1 > num2 && num1 >num3){
            System.out.println("O número " + num1 + " é maior número! " );
        } else if (num2 > num1 && num2 >num3) {
            System.out.println("O número " + num2 + " é O maior número!");

        }else{
            System.out.println("O número " + num3 + " é o maior!");

        }
        sc.close();
    }
}
