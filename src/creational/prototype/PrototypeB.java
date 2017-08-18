package creational.prototype;

public class PrototypeB extends Prototype {
  private String name = "PrototypeB";
  
  public Prototype clone() throws CloneNotSupportedException {
    return super.clone();
  }
  
  public void print() {
    System.out.println(name);
  }
}