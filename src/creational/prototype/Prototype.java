package creational.prototype;

public abstract class Prototype implements Cloneable {
  private String name = "Prototype";
  
  public Prototype clone() throws CloneNotSupportedException {
    return (Prototype) super.clone();
  }
  
  public void print() {
    System.out.println(name);
  }
}