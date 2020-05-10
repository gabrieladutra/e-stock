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
                if(price > 0){
                    currentProduct.setPrice(price);
                }
            }

        }

    }

}
