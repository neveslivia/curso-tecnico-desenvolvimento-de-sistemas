package RevisaoBasicos;

import java.util.Scanner;

public class Entre100e200 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = sc.nextInt();

        if(num >100 && num < 200){
            System.out.println("O número está entre o intervalo!");
        }else {
            System.out.println("O número não está entre o intervalo!");
        }
        sc.close();
    }
}
