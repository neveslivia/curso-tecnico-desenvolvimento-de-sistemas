package programs;

import java.util.ArrayList;
import java.util.List;

public class somaForEach {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(54);
        list.add(79);
        list.add(9);
        list.add(35);
        list.add(98);
        list.add(17);
        list.add(123);
        list.add(61);
        list.add(73);
        list.add(5);
        list.add(45);
        list.add(13);
        int soma=0;

        for (Integer numeros : list){
            soma += numeros;
        }
        System.out.println("A soma dos números da lista é: "+ soma);
    }
}
