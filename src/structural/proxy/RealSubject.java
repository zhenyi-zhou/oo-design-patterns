package structural.proxy;

public class RealSubject implements Subject {
  private String name = "RealSubject";
  
  public void print() {
    System.out.println(name);
  }
}