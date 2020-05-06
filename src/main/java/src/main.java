package src;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Menu m = new Menu();

        Integer option = null;
        while (option == null || option != 0) {
            m.display();
            option = m.readOption();

            switch (option) {
                case 1:
                    ProductFactory factory = new ProductFactory();
                    factory.fromConsole();
                    break;


            }

        }
    }
}
