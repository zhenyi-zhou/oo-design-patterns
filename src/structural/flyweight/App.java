public class App {
  public static void main(String[] args) {
    FlyweightFactory factory = new FlyweightFactory();
    
    Flyweight flyweight1 = factory.createFlyweight("0001");
    flyweight1.print();
    
    Flyweight flyweight2 = factory.createFlyweight("0002");
    flyweight2.print();
    
    Flyweight flyweight3 = factory.createFlyweight("0003");
    flyweight3.print();
    
    Flyweight flyweight4 = factory.createFlyweight("0001");
    flyweight4.print();
  }
}