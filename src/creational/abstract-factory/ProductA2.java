public class ProductA2 implements ProductA {
  private String name = "ProductA2";
  
  public void print(String factoryName) {
    System.out.println(factoryName + " created " + name);
  }
}