package ExerciciosFor;

import java.util.Arrays;

public class Ex_29 {
    public static void main(String[] args) {
        int[] vetor = {5, 2, 8, 1, 9, 3, 4};
        int n = vetor.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (vetor[j] < vetor[i]) { // Compara e já troca sem variável extra
                    int temp = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = temp;
                }
            }
        }

        System.out.println("Vetor ordenado: " + Arrays.toString(vetor));
    }
}
