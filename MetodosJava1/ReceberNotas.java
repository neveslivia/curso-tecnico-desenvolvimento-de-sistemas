package CriacaodeMetodos;

import java.util.Scanner;

public class ReceberNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite três notas: ");
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();

        double media = med(n1, n2, n3);

        showResult(media);
        sc.close();

    }
    public static double med(double a, double b, double c){
        double soma;
        double  medi;
        soma= a + b + c;
        medi = soma /3;

        return medi;

    }
    public static void showResult(double value){
        System.out.printf("A média é %.2f: " , value);
    }
}
