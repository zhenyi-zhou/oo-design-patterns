package structural.bridge;

public class App {
  public static void main(String[] args) {
    Abstraction abstractionA = new RefinedAbstraction(new ImplementorA());
    abstractionA.print();
    
    Abstraction abstractionB = new RefinedAbstraction(new ImplementorB());
    abstractionB.print();
  }
}