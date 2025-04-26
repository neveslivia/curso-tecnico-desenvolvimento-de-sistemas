package programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class verificacaodeNumeronaLista {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List <Integer> list = new ArrayList<>();
        list.add(45);
        list.add(7);
        list.add(89);
        list.add(41);
        list.add(71);
        list.add(11);
        list.add(2);
        list.add(17);

        System.out.println("Digite um número: ");
        int num = sc.nextInt();
        boolean igual = false;


        for (Integer numero : list) {
            if (numero == num) {
             igual = true;
            }
        }
        System.out.println((igual)? "O número está presente na lista!": "O número não está presente na lista!");

        



        sc.close();
    }
}
