package creational.abstractfactory;

public class ProductB2 implements ProductB {
  private String name = "ProductB2";
  
  public void print(String factoryName) {
    System.out.println(factoryName + " created " + name);
  }
}