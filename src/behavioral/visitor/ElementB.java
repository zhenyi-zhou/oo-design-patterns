package behavioral.visitor;

public class ElementB implements Element {
  private String name = "ElementB";
  
  public String getName() {
    return name;
  }
  
  public void accept(Visitor visitor) {
    visitor.visit(this);
  }
}