package ExerciciosFor;

public class Ex_6 {
    public static void main(String[] args) {
        int soma = 0;
        for (int i = 1; i<=100 ; i++  ){
            if (i% 2 == 0){
                soma += i;
            }

        }
        System.out.println("A soma de todos os números pares de 1 a 100 é " + soma);
    }
}
