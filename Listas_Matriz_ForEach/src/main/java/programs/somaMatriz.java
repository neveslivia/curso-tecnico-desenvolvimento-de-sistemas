package programs;

import java.util.Scanner;

public class somaMatriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Digite 9 números inteiros:");

        int  [][] matriz =new int [3][3];
        for (int i = 0; i < 3; i++){
            for (int j =0; j< 3; j++){
                matriz[i][j] = sc.nextInt();



            }
        }
        int soma =0;
        for (int i = 0; i < 3; i++){
            for (int j =0; j< 3; j++){
                soma = soma+ matriz[i][j];




            }

        }
        System.out.println("A soma dos números da matriz é: " + soma);
        sc.close();
    }
}
