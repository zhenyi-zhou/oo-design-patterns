package creational.prototype;

public class App {
  private Prototype prototype;
  
  public static void main(String[] args) {
    Client clientA = new Client(new PrototypeA());
    Prototype cloneA = (Prototype) clientA.createPrototype();
    cloneA.print();
    
    Client clientB = new Client(new PrototypeB());
    Prototype cloneB = (Prototype) clientB.createPrototype();
    cloneB.print();
  }
}