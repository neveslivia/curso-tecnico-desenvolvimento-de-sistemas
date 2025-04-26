package OperacoesMatematicas;

import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do primeiro lado: ");
        int ld1 = sc.nextInt();
        System.out.println("Digite o valor do segundo lado: ");
        int ld2 = sc.nextInt();
        System.out.println("Digite o valor do terceiro lado: ");
        int ld3 = sc.nextInt();

        if((ld1 + ld2 < ld3) ||(ld2 + ld3 < ld1) ||(ld1 + ld3 < ld2)){
            System.out.println("Esses números podem formar um triângulo!");
        }else{
            System.out.println("Esses números não podem formar um triângulo!");
        }
        sc.close();

    }
}
