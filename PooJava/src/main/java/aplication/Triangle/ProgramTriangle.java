package aplication.Triangle;

import entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class ProgramTriangle {
    public static void main(String[] args) {
      Locale.setDefault(Locale.US);

      Triangle x,y;
      x = new Triangle();
      y = new Triangle();

      Scanner sc= new Scanner(System.in);
        System.out.println();
        System.out.println("Digite os parâmetros do triângulo x: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Digite os parâmetros do triângulo y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areax = x.area();
        double areay = x.area();

        System.out.println("A área de x é "+ areax);
        System.out.println("A área de y é "+ areay);

        Triangle larger = Triangle.largerTriangle(x,y);
        System.out.println("O maior triângulo é " + (larger == x? "x": "y"));








    }




}



