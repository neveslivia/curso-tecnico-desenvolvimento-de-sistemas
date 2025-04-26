package programs;

import java.util.ArrayList;
import java.util.List;

public class numerosParesForEach {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(2);
        list.add(71);
        list.add(93);
        list.add(1);
        list.add(12);
        list.add(5);
        list.add(90);
        list.add(3);
        list.add(18);




        for (Integer numero : list){
            if (numero %2 ==0){
                System.out.println(numero);

            }


        }
    }
}
