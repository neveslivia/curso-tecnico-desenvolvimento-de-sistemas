package ExerciciosFor;

public class Ex_27 {
    public static void main(String[] args) {
        int[] vetor = {5, 2, 8, 1, 9, 3, 4};
        int soma = 0;
        for (int num : vetor)
            soma += num;
        System.out.println("Soma: " + soma);
    }
}
