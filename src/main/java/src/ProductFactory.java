package src;
import com.google.gson.Gson;

import java.util.Scanner;

public class ProductFactory {


    public Product fromConsole() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Register product: ");
        System.out.println();
        System.out.println("Product name: \n");
        String name = sc.nextLine();
        System.out.println("Product price: \n");
        Double price = sc.nextDouble();


        Product p = new Product(name, price);
        Gson json = new Gson();
        String response = json.toJson(p);
        return p;

    }


}
