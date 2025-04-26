package programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class duasListas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dgitite 5 números: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();
        int num5 = sc.nextInt();


        List<Integer> list1 = new ArrayList<>();
        list1.add(num1);
        list1.add(num2);
        list1.add(num3);
        list1.add(num4);
        list1.add(num5);
        System.out.println("Lista 1: " + list1);

        System.out.println("Dgitite  mais 5 números: ");
        int num6 = sc.nextInt();
        int num7 = sc.nextInt();
        int num8 = sc.nextInt();
        int num9 = sc.nextInt();
        int num10 = sc.nextInt();

        List<Integer> list2 = new ArrayList<>();
        list2.add(num6);
        list2.add(num7);
        list2.add(num8);
        list2.add(num9);
        list2.add(num10);
        System.out.println("Lista 2: " + list2);

       List <Integer> concatenacao = new ArrayList<>(list1);
       concatenacao.addAll(list2);
        System.out.println("A junção das listas é: "+concatenacao);
    }





    }

