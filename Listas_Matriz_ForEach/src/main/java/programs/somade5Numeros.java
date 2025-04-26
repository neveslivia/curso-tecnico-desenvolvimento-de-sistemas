package programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class somade5Numeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dgitite 5 números: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();
        int num5 = sc.nextInt();

        List<Integer> list = new ArrayList<>();
        list.add(num1);
        list.add(num2);
        list.add(num3);
        list.add(num4);
        list.add(num5);
        int soma =0;

        for (Integer numeros : list){
            soma += numeros;
        }
        System.out.println("A soma dos números é: " + soma);
        sc.close();
    }
}
