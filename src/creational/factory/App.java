public class App {
  public static void main(String[] args) {
    Factory factory = new Factory();

    Product productA = factory.createProduct('A');
    productA.print(factory.getName());
    
    Product productB = factory.createProduct('B');
    productB.print(factory.getName());
  }
}