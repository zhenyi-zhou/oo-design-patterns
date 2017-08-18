package structural.bridge;

public class ImplementorB implements Implementor {
  private String name = "ImplementorB";
  
  public void print() {
    System.out.println(name);
  }
}