public class ElementA implements Element {
  private String name = "ElementA";
  
  public String getName() {
    return name;
  }
  
  public void accept(Visitor visitor) {
    visitor.visit(this);
  }
}