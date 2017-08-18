package creational.abstractfactory;

public class Factory1 implements Factory {
  private String name = "Factory1";
  
  public String getName() {
    return name;
  }
  
  public ProductA createProductA() {
    return new ProductA1();
  }
  
  public ProductB createProductB() {
    return new ProductB1();
  }
}