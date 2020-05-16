package src;


import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ProductRepository {
    private static ProductRepository repositoryInstance;
    private List<Product> products = readProducts();

    private ProductRepository() {

    }

    public List<Product> readProducts() {
        try {
            ObjectMapper mapper = new ObjectMapper();
            Product[] json = mapper.readValue(new File("allProducts.json"), Product[].class);
            List<Product> products = Arrays.stream(json).collect(Collectors.toList());

            return products;
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    public void writeProducts() {
        try {
            ObjectMapper mapper = new ObjectMapper();

            mapper
                    .writerWithDefaultPrettyPrinter()
                    .writeValue(new File("allProducts.json"), products);


        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    public static ProductRepository getInstance() {
        if (repositoryInstance == null) {
            repositoryInstance = new ProductRepository();
        }
        return repositoryInstance;
    }

    public void add(Product product) {
        products.add(product);
        writeProducts();

    }

    public List<Product> getMany() {
        return products;
    }

    public Product getItem(String name) {
        for (int i = 0; i < products.size(); i++) {
            Product currentObject = products.get(i);
            if (currentObject.getName().contains(name)) {
                return currentObject;
            }
        }
        return null;
    }

    public Integer getSize() {
        return products.size();

    }

    public void delete(Integer id) {
        for (int i = 0; i < products.size(); i++) {
            Product currentProduct = products.get(i);
            if (currentProduct.getId().equals(id))
                products.remove(currentProduct);
        }
        writeProducts();
    }

    public void alter(Integer id) {
        for (int i = 0; i < products.size(); i++) {
            Product currentProduct = products.get(i);
            if (currentProduct.getId().equals(id)) {
                Menu menu = new Menu();
                System.out.println("Name" + "[" + currentProduct.getName() + "] = ");
                String name = menu.readString();
                if (!name.equals("")) {
                    currentProduct.setName(name);
                }

                System.out.println("Price" + "[" + currentProduct.getPrice() + "] = ");
                Double price = menu.readDouble();
                if (price > 0) {
                    currentProduct.setPrice(price);
                }
            }

        }
        writeProducts();
    }

}
