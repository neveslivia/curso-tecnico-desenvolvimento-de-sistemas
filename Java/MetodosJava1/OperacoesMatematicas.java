package CriacaodeMetodos;

import java.util.Scanner;

public class OperacoesMatematicas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número inteiro:");
        int num1 = sc.nextInt();
        System.out.println("Digite outro número inteiro:");
        int num2 = sc.nextInt();

        boolean resultado = sum(num1,num2);

        showResult(resultado);
        sc.close();
    }
    public static boolean sum(int a, int b){
        int s = a + b;
        return s > 100;
    }
    public static void showResult(boolean maior){
        if (maior){
            System.out.println("A soma dos números é maior de que 100!");

        }else{
            System.out.println("A soma do números é menor do que 100!");
        }
    }
}
