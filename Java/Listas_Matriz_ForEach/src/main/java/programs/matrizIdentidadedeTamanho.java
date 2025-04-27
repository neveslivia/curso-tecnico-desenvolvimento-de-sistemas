package programs;

import java.util.Scanner;

public class matrizIdentidadedeTamanho {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número para gerar uma matriz identidade de tamnho:");
        int num = sc.nextInt();
        int [][] matriz = new int [num][num];

        for (int i = 0; i <= matriz.length -1; i++ ){
            for (int j = 0; j<= matriz.length -1; j++){
                matriz[i][j]= 0;
                matriz[i][i] = 1;
                System.out.print(matriz[i][j] + " ");

            }
            System.out.println();
        }


        sc.close();
    }
}
