package src;

import java.util.Scanner;

public class Menu {

    Scanner sc = new Scanner(System.in);

    public void display() {
        System.out.println("Select an option: \n");
        System.out.println("0-Exit \n");
        System.out.println("1-Register a product \n");
        System.out.println("2- List all products ");

    }

    public Integer readOption() {
        Integer option = sc.nextInt();
        return option;
    }

}
