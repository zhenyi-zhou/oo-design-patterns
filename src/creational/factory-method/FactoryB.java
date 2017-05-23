public class FactoryB implements Factory {
  private String name = "FactoryB";
  
  public String getName() {
    return name;
  }
  
  public Product createProduct() {
    return new ProductB();
  }
}