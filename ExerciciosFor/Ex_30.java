package ExerciciosFor;

public class Ex_30 {
    public static void main(String[] args) {
        int[] vetor = {5, 2, 8, 1, 9, 3, 4};
        int pares = 0, impares = 0;

        for (int num : vetor) {
            if (num % 2 == 0) pares++;
            else impares++;
        }

        System.out.println("Pares: " + pares + ", Ímpares: " + impares);
    }
}
