package creational.factorymethod;

public class ProductA implements Product {
  private String name = "ProductA";
  
  public void print(String factoryName) {
    System.out.println(factoryName + " created " + name);
  }
}