package src;

import java.util.Scanner;

public class ProductFactory {
    public Product fromConsole() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Register product: ");
        System.out.println("Product id: \n");
        Integer id = sc.nextInt();
        System.out.println("Product name: \n");
        String name = sc.next();
        System.out.println("Product price: \n");
        Double price = sc.nextDouble();

        Product p = new Product(id, name, price);
        return p;
    }
}
