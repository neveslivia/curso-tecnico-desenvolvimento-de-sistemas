package programs;

import java.util.*;

public class multiplicacaoForEach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número para multiplicar uma lista: ");
        int num = sc.nextInt();
        int multiplicacao = 0;

        List<Integer> list = new ArrayList<>();
        list.add(98);
        list.add(54);
        list.add(7);
        list.add(6);
        list.add(16);

        for (Integer numero : list){
            multiplicacao = num * numero;
            System.out.println("O produto entre o número da lista e o digitado é: " + multiplicacao);
        }




        sc.close();
    }
}
