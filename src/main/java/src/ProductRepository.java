package src;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository {
    private static ProductRepository repositoryInstance;
    public List<Product> products = new ArrayList<>();

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

    public Product getItem(Integer idItem) {
        for (int i = 0; i < products.size(); i++) {
            Product currentObject = products.get(i);
            if (currentObject.getId() == idItem) {
                return currentObject;
            }
        }
        return null;
    }
}
