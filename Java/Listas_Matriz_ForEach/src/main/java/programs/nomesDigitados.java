package programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class nomesDigitados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 5 nomes: ");
        String nome1 = sc.next();
        String nome2 = sc.next();
        String nome3 = sc.next();
        String nome4 = sc.next();
        String nome5 = sc.next();

        List<String> list = new ArrayList<>();
        list.add(nome1);
        list.add(nome2);
        list.add(nome3);
        list.add(nome4);
        list.add(nome5);
        Collections.sort(list);
        System.out.println(list);

    }
}
