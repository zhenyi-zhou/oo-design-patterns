public class ProductA1 implements ProductA {
  private String name = "ProductA1";
  
  public void print(String factoryName) {
    System.out.println(factoryName + " created " + name);
  }
}