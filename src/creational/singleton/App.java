package creational.singleton;

public class App {
  public static void main(String[] args) {
    Singleton instance1 = Singleton.getInstance();
    instance1.print();
    
    Singleton instance2 = Singleton.getInstance();
    instance2.print();
  }
}