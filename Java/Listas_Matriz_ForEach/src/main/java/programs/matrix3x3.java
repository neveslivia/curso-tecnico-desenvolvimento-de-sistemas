package programs;

import java.util.Scanner;

public class matrix3x3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Digite 9 números inteiros:");

        int  [][] matriz =new int [3][3];
        for (int i = 0; i < 3; i++){
            for (int j =0; j< 3; j++){
                matriz[i][j] = sc.nextInt();



            }
        }
        System.out.println("Matrix 3x3: ");
        for (int i = 0; i < 3; i++){
            for (int j =0; j< 3; j++){
                System.out.print(matriz[i][j] +" ");



            }
            System.out.println();
        }
        sc.close();





    }
}
