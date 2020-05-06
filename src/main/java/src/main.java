package src;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Menu m = new Menu();
        m.display();
        Integer option = m.readOption();

        switch(option){
            case 1:
                Scanner sc = new Scanner(System.in);
                System.out.println("Register product: ");
                System.out.println("Product id: \n");
                Integer id = sc.nextInt();
                System.out.println("Product name: \n");
                String name = sc.next();
                System.out.println("Product price: \n");
                Double price = sc.nextDouble();

                Product p = new Product(id, name, price);

        }

    }
}
