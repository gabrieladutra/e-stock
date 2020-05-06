package src;

import java.util.Scanner;

public class Menu {

    Scanner sc = new Scanner(System.in);

    public void display() {
        System.out.println("Select an option: \n");
        System.out.println("1-Register a product \n");
    }

    public Integer readOption() {
        Integer option = sc.nextInt();
        return option;
    }

}
