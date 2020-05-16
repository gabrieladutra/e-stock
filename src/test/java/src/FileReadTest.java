package src;


import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileReadTest {
    /*@Test
    public void writeAJsonFile() {
        Product product = new Product("Computer", 2543d);
        Gson gson = new Gson();
        String json = gson.toJson(product);

        try {
            FileWriter writer = new FileWriter("allProducts.json");
            writer.write(json);
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void readeAJsonFile() {
        try {
            File productsFile = new File("products.json");
            Scanner reader = new Scanner(productsFile);
            String allFile = "";

            while (reader.hasNextLine()) {
                String nextLine = reader.nextLine();
                allFile = allFile + nextLine;
            }
            reader.close();
            System.out.println(allFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void writeJson() {
        Product product = new Product("Keyboard", 23d);
        Gson gson = new Gson();
        String json = gson.toJson(product);

        try {
            FileWriter writer = new FileWriter("allProducts.json");
            writer.write(json);
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    @Test
    public void readJson() {
        try {
            File productsFile = new File("allProducts.json");
            Scanner reader = new Scanner(productsFile);
            String allFile = "";

            while (reader.hasNextLine()) {
                String nextLine = reader.nextLine();
                allFile = allFile + nextLine;
            }
            reader.close();
            System.out.println(allFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void deleteFile() {
        File productsFile = new File("allProducts.json");
        if (productsFile.delete()) {
            System.out.println("Deleted the file: " + productsFile.getName());
        } else
            System.out.println("Failed to delete the file.");
    }


    @Test
    public void deleteAFile() {
        File productFile = new File("allProducts.json");
        if (productFile.delete()) {
            System.out.println("Deleted file: " + productFile.getName());
        } else
            System.out.println("File not found");

    }

    @Test
    public void sumNumbers() {
        int currentResult = 0;
        for (int i = 0; i <= 100; i++) currentResult += i;
        System.out.println(currentResult);
    }


    @Test
    public void readWriteJackson() throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        String jsonInput = "{\"id\":0,\"name\":\"mesa\",\"price\":\"123.55\"}";
        Product q = mapper.readValue(jsonInput, Product.class);
        System.out.println("Read and parsed Person from JSON: " + q);

        Product p = new Product("desk", 444d);
        System.out.print("Person object " + p + " as JSON = ");
        mapper.writeValue(System.out, p);

    }*/


    @Test
    public void writeJsonList() throws FileNotFoundException {

    }

    @Test
    public void jacksonReadAFile() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        Product productFile = mapper.readValue(new File("products.json"), Product.class);
        System.out.println(productFile);
    }

    @Test
    public void jsonConvertList() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        //le uma string json e transforma em objeto
        Product[] json = mapper.readValue(new File("allProducts.json"), Product[].class);
        //cria uma lista de produtos com os objetos da string Json
        List<Product> lista = new ArrayList<>(List.of(json));

        // adiciona um novo produto na lista
        Product product = new Product("Keyboard", 23d);
        lista.add(product);


        // Escreve as mudanças no arquivo
        mapper
                .writerWithDefaultPrettyPrinter()
                .writeValue(new File("allProducts.json"), lista);


    }
}
