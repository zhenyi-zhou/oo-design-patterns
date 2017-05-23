public class Factory2 implements Factory {
  private String name = "Factory2";
  
  public String getName() {
    return name;
  }
  
  public ProductA createProductA() {
    return new ProductA2();
  }
  
  public ProductB createProductB() {
    return new ProductB2();
  }
}