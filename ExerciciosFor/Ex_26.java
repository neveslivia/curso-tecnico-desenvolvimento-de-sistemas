package ExerciciosFor;

public class Ex_26 {
    public static void main(String[] args) {
        int base = 5;
        int meio = base / 2;

        for (int i = 1; i <= base; i += 2) {
            for (int j = 0; j < meio - i / 2; j++)
                System.out.print(" ");
            for (int j = 1; j <= i; j++)
                System.out.print(j);
            System.out.println();
        }
        for (int i = base - 2; i >= 1; i -= 2) {
            for (int j = 0; j < meio - i / 2; j++)
                System.out.print(" ");
            for (int j = 1; j <= i; j++)
                System.out.print(j);
            System.out.println();
        }
    }
}
