package programs;

import java.util.ArrayList;
import java.util.List;

public class substituirValoresNegativos {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(789);
        list.add(90);
        list.add(56);
        list.add(89);
        list.add(-12);
        list.add(-9);
        list.add(-1);
        list.add(2);
        list.add(89);




        System.out.println("Versão original da lista: " + list);
        System.out.println();

        for (Integer numeros : list) {
            if (numeros < 0) {
                list.set(list.indexOf(numeros), 0);
            }
        }
        System.out.println("Versão atualizada da lista: " + list);

    }
}
