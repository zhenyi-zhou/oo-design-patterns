public class App {
  public static void main(String[] args) {
    Factory factoryA = new FactoryA();
    Factory factoryB = new FactoryB();

    Product productA = factoryA.createProduct();
    productA.print(factoryA.getName());
    
    Product productB = factoryB.createProduct();
    productB.print(factoryB.getName());
  }
}