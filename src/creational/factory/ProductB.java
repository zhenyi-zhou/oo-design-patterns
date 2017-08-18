package creational.factory;

public class ProductB implements Product {
  private String name = "ProductB";
  
  public void print(String factoryName) {
    System.out.println(factoryName + " created " + name);
  }
}