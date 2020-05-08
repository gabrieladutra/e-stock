package src;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository {
    private static ProductRepository repositoryInstance;
    private List<Product> products = new ArrayList<>();

    private ProductRepository() {
    }

    public static ProductRepository getInstance() {
        if (repositoryInstance == null) {
            repositoryInstance = new ProductRepository();
        }
        return repositoryInstance;
    }

    public void add(Product product) {
        products.add(product);
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
    }
}
