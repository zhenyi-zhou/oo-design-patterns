package structural.bridge;

public class ImplementorA implements Implementor {
  private String name = "ImplementorA";
  
  public void print() {
    System.out.println(name);
  }
}