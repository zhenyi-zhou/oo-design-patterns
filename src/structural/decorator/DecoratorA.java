package structural.decorator;

public class DecoratorA extends Decorator {
  private String name = "DecoratorA";
  
  public DecoratorA(Component component) {
    super(component);
  }
  
  public void print() {
    beforePrint();
    super.print();
  }
  
  private void beforePrint() {
    System.out.println(name + " extended before");
  }
}