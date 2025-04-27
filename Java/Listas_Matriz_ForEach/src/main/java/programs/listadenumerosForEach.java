package programs;

import java.util.ArrayList;
import java.util.List;

public class listadenumerosForEach {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(789);
        list.add(90);
        list.add(56);
        list.add(89);

        for (Integer numeros : list){
            System.out.println(" " + numeros);
        }


    }
}
