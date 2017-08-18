package creational.factorymethod;

public class FactoryA implements Factory {
  private String name = "FactoryA";
  
  public String getName() {
    return name;
  }
  
  public Product createProduct() {
    return new ProductA();
  }
}