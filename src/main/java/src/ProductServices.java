package src;
import java.util.List;
public class ProductServices {

    public void add() {
        ProductFactory factory = new ProductFactory();
        Product product = factory.fromConsole();

        ProductRepository.getInstance().add(product);
    }

    public void list() {
        List<Product> allProducts = ProductRepository.getInstance().getMany();
        for (Product currentProduct : allProducts) {
            System.out.println(currentProduct);
        }
    }

    public void displayItem() {
        List<Product> allProducts = ProductRepository.getInstance().getMany();
        Menu m = new Menu();
        System.out.println("Item name: \n");
        String item = m.readString();

        for (Product currentProduct : allProducts) {
            if (currentProduct.getName().contains(item)) {
                System.out.println(currentProduct);
            }
        }
    }

    public void deleteItem() {
        Menu m = new Menu();
        System.out.println("Product id: \n");
        Integer id = m.readOption();
        ProductRepository.getInstance().delete(id);

    }

    public void alterItem(){
        Menu m = new Menu();
        System.out.println("Product id: \n");
        Integer id = m.readOption();
        ProductRepository.getInstance().alter(id);


    }

}

