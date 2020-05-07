package src;

import java.util.Scanner;

public class Product {
    private Integer id;
    private String name;
    private Double price;

    public Product(Integer id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return id.toString() + "-" + name;
    }
}
