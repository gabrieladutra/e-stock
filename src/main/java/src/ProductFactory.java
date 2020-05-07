package src;

import java.util.Scanner;

public class ProductFactory {
    public Product fromConsole() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Register product: ");
        System.out.println();
        System.out.println("Product name: \n");
        String name = sc.next();
        System.out.println("Product price: \n");
        Double price = sc.nextDouble();


        Product p = new Product(name, price);
        System.out.println(p.getId());
        return p;

    }

}
