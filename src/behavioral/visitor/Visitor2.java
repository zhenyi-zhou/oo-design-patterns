public class Visitor2 implements Visitor {
  private String name = "Visitor2";
  
  public void visit(ElementA elementA) {
    System.out.println(name + " visited " + elementA.getName());
  }
  
  public void visit(ElementB elementB) {
    System.out.println(name + " visited " + elementB.getName());
  }
}