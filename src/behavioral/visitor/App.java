package behavioral.visitor;

public class App {
  public static void main(String[] args) {
    Visitor visitor1 = new Visitor1();
    Visitor visitor2 = new Visitor2();
    
    Element elementA = new ElementA();
    elementA.accept(visitor1);
    elementA.accept(visitor2);
    
    Element elementB = new ElementB();
    elementB.accept(visitor1);
    elementB.accept(visitor2);
  }
}