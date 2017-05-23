public class Client {
  private Prototype prototype;
  
  public Client(Prototype prototype) {
    this.prototype = prototype;
  }
  
  public Prototype createPrototype() {
    try {
      return (Prototype) prototype.clone();
    } catch (CloneNotSupportedException e) {
      System.out.println("CloneNotSupportedException: " + e.getMessage());
      return null;
    }
  }
}