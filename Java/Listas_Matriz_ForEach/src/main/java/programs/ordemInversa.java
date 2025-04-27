package programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ordemInversa {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(8);
        list.add(951);
        list.add(159);
        list.add(753);
        list.add(357);
        list.add(852);
        list.add(258);
        list.add(963);
        list.add(375);

        Collections.reverse(list);
        System.out.println(list);

    }
}
