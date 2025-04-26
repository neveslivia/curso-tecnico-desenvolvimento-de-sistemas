package criacaodetelas.crudjava.aplication;

import criacaodetelas.crudjava.entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class ProgramRectangle {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Rectangle retangle = new Rectangle();
        System.out.println("Enter rectangle width and height: ");
        retangle.setX(sc.nextDouble());
        retangle.setY(sc.nextDouble());
        System.out.println(retangle);

        sc.close();
    }
}
