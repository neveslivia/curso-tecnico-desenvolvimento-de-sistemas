package ExerciciosFor;

public class Ex_15 {
    public static void main(String[] args) {
        String mult3 = "Fizz";
        String mult5 = "Buzz";
        for (int i = 1; i <=100; i++){
            if (i %3 ==0){
                System.out.println(mult3);
            } else if (i%5 == 0) {
                System.out.println(mult5);
            }else{
                System.out.println(i);
            }
        }
    }
}
