package creational.abstractfactory;

public class ProductB1 implements ProductB {
  private String name = "ProductB1";
  
  public void print(String factoryName) {
    System.out.println(factoryName + " created " + name);
  }
}