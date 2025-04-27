package programs;

import java.util.ArrayList;
import java.util.List;

public class remocaodeNumero {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(58);
        list.add(7);
        list.add(89);
        list.add(90);
        list.add(71);
        list.add(11);
        list.add(2);
        list.add(17);
        for (Integer numero : list){
            System.out.println(numero);
        }
        System.out.println("------------------------------------");
       list.removeIf(numero -> numero%2 != 0 );

        for (Integer numero : list){
            System.out.println(numero);
        }



    }
}
