package creational.factory;

public class Factory {
  private String name = "Factory";
  
  public String getName() {
    return name;
  }
  
  public Product createProduct(char type) {
    switch(type) {
      case 'A':
        return new ProductA();
      case 'B':
        return new ProductB();
      default:
       return null;
    }
  }
}