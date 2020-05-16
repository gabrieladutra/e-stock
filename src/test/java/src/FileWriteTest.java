package src;

public class FileWriteTest {
/*
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




   @Test
    public void readProduct() {
        try {
            File product = new File("products.json");
            String productFile = "";

            Scanner myReader = new Scanner(product);
            while (myReader.hasNextLine()) {
                String nextLine = myReader.nextLine();
                productFile = productFile + nextLine;
            }
            myReader.close();
            System.out.println(productFile);
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }*/

 /*   @Test
    public void readWriteJackson() throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        String jsonInput = "{\"id\":0,\"name\":\"Mesa\",\"price\":\"123.55\"}";
        Product q = mapper.readValue(jsonInput, Product.class);
        System.out.println("Read and parsed Person from JSON: " + q);

        Product p = new Product("Cadeira", 55d);
        System.out.println("Person object " + p + " as JSON = ");
        mapper.writeValue(System.out, p);
    }
*/
  /* @Test
    public void jacksonWriteFile() throws IOException {
        ObjectMapper mapper = new ObjectMapper();

      //  String productsFile = mapper.readValue("products.json", new Product())
       Product  product = new Product("cadeira", 123d);
       mapper.writeValue(new File("allProducts.json"), product);
//        String strProduct = mapper.writeValueAsString(product);
        // Escrever em disco


    }*/


}