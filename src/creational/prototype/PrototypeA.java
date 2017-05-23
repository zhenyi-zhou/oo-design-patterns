public class PrototypeA extends Prototype {
  private String name = "PrototypeA";
  
  public Prototype clone() throws CloneNotSupportedException {
    return super.clone();
  }
  
  public void print() {
    System.out.println(name);
  }
}