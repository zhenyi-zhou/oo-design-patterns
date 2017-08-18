package creational.abstractfactory;

public class App {
  public static void main(String[] args) {
    Factory factory1 = new Factory1();
    
    ProductA productA1 = factory1.createProductA();
    productA1.print(factory1.getName());
    
    ProductB productB1 = factory1.createProductB();
    productB1.print(factory1.getName());
    
    Factory factory2 = new Factory2();
    
    ProductA productA2 = factory2.createProductA();
    productA2.print(factory2.getName());
    
    ProductB productB2 = factory2.createProductB();
    productB2.print(factory2.getName());
  }
}