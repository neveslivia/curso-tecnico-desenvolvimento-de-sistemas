package CriacaodeMetodos;

import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite três números: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        int maior = max( n1, n2, n3);

        showResult(maior);

        sc.close();

    }
    public static int max(int a, int b, int c){
        int maximo;
        if (a>b && a > c){
            maximo = a;
        } else if ( b >c) {
            maximo = b;

        }else{
            maximo = c;
        }
        return maximo;
    }
    public static void showResult(int valor){
        System.out.println("O maior número é: " +valor);
    }
}
