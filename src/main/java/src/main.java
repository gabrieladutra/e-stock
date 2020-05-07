package src;

import java.util.List;

public class main {
    public static void main(String[] args) {

        Menu m = new Menu();

        Integer option = null;
        ProductRepository repository = ProductRepository.getInstance();


        while (option == null || option != 0) {
            m.display();
            option = m.readOption();

            switch (option) {
                case 1:
                    ProductFactory factory = new ProductFactory();
                    Product product = factory.fromConsole();

                    repository.add(product);
                    break;

                case 2:
                    List<Product> allProducts = repository.getMany();
                    for (int i = 0; i < allProducts.size(); i++) {
                        Product currentProduct = allProducts.get(i);
                        System.out.println(currentProduct);
                    }
                    break;
                case 3:
                    System.out.println("Item id: \n");
                    Integer item = m.readOption();
                    System.out.println(repository.getItem(item));
                    break;

            }
        }
    }
}
