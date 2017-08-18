package behavioral.visitor;

public class Visitor1 implements Visitor {
  private String name = "Visitor1";
  
  public void visit(ElementA elementA) {
    System.out.println(name + " visited " + elementA.getName());
  }
  
  public void visit(ElementB elementB) {
    System.out.println(name + " visited " + elementB.getName());
  }
}