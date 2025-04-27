package ExerciciosFor;

public class Ex_13 {
    public static void main(String[] args) {
        int a = 1;
        for (int i = 1; i <= 55;){
            System.out.print(i + ",");
            i = i + a;
            a = i - a;


        }



    }
}
