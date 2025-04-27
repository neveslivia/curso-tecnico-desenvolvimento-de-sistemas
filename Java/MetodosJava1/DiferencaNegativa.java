package CriacaodeMetodos;

import java.util.Scanner;

public class DiferencaNegativa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número inteiro:");
        int num1 = sc.nextInt();
        System.out.println("Digite outro número inteiro:");
        int num2 = sc.nextInt();

        boolean diferenca = dif(num1, num2);

        showResult(diferenca);

        sc.close();
    }
    public static boolean dif(int a, int b){
        int diferenca = a -b;
        return  diferenca< 0;
    }
    public static void showResult (boolean diferenca){
        if (diferenca){
            System.out.println("A diferença dos números é negativa!");

        }else{
            System.out.println("A diferença dos números é positiva!");
        }

    }
}
