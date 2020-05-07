package src;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository {
  List<Product> products = new ArrayList<>();

  public  void add(Product product) {
    products.add(product);
  }

  public List<Product> getMany() {
    return products;
  }
}
