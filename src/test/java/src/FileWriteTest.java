package src;

import com.google.gson.Gson;
import org.junit.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteTest {
    @Test
    public void testWrite() throws IOException {

        try {
      File myObj = new File("filename.txt");
      if (myObj.createNewFile()) {
        System.out.println("File created: " + myObj.getName());
      } else {
        System.out.println("File already exists.");
      }
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    }
    @Test
    public void convertObject(){
        Product product = new Product("Mesa de madeira", 345d);
        Gson gson = new Gson();
        String json = gson.toJson(product);
        System.out.println(product);

        try {
            FileWriter myWriter = new FileWriter("products.json");
            myWriter.write(json);
            myWriter.close();

        } catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}
