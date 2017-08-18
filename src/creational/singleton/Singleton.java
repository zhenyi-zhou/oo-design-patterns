package creational.singleton;

public final class Singleton {
  private String name = "Singleton";
  private static Singleton instance = new Singleton();
  
  private Singleton() {}
  
  public static Singleton getInstance() {
    return instance;
  }
  
  public void print() {
    System.out.println(name);
  }
}