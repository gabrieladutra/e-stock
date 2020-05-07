package src;

import java.util.Scanner;

public class Menu {

    Scanner sc = new Scanner(System.in);

    public void display() {
        System.out.println("Select an option: \n");
        System.out.println("0-Exit");
        System.out.println("1-Register a product ");
        System.out.println("2- List all products ");
        System.out.println("3- Find product ");

    }

    public Integer readOption() {
        Integer option = sc.nextInt();
        return option;
    }

}
