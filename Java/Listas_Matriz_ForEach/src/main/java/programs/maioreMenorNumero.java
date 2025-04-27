package programs;

import java.util.ArrayList;
import java.util.List;

public class maioreMenorNumero {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(78);
        list.add(52);
        list.add(11);
        list.add(96);
        list.add(3);
        list.add(13);
        list.add(17);
        list.add(45);
        list.add(73);
        int maior =0;
        int menor = 100;
        for (Integer num : list){
            if (num > maior){
                maior = num;
            }
        }
        for (Integer num : list){
            if (num < menor){
                menor = num;
            }
        }

        System.out.println("O maior número é: "+ maior);
        System.out.println("O menor número é: "+ menor);

    }
}
