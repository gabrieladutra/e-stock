package src;

import java.util.Scanner;

public class Product {

    private Integer id;
    private String name;
    private Double price;

    public Product(String name, Double price) {

        Integer newId = ProductRepository.getInstance().getSize() + 1;
        this.id = newId;
        this.name = name;
        this.price = price;

    }

    public String getName() {
        return name;
    }

    public Integer getId() {

        return id;
    }


    @Override
    public String toString() {

        return id.toString() + "-" + name + "-" + price;
    }

}
