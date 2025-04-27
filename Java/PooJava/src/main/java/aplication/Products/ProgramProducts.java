package aplication.Products;

import entities.Product;


import java.util.Locale;
import java.util.Scanner;

public class ProgramProducts {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
       Scanner sc = new Scanner(System.in);

       Product product = new Product();
        System.out.println("Enter product data:");
        System.out.println("Name:");
        product.setName(sc.nextLine());
        System.out.println("Price: ");
        product.setPrice(sc.nextDouble());
        System.out.println("Quantity in stock:");
        product.setQuantity(sc.nextInt());

        System.out.println("Product data: "+ product.getName() + ","+" $"+ product.getPrice() +" , " + product.getQuantity() +" units,"+ "Total: $"+ product.totalValue());
        System.out.println();

        System.out.println("Enter the number of products to be added in stock:");
        product.setQuantityadd(sc.nextInt());

        System.out.println();
        System.out.printf("Updatedata: %s $%.2f,%d units,Total: %.2f", product.getName(), product.getPrice(), product.addProducts(),product.totalValue2());


        System.out.println();
        System.out.println("Enter the number of products to be removed from stock: ");
        product.setQuantityremove(sc.nextInt());

        System.out.println();
        System.out.printf("Updatedata: %s $%.2f,%d units,Total: %.2f", product.getName(), product.getPrice(), product.removeProducts(),product.totalValue3());

        sc.close();

    }
}
