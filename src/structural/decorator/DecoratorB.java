public class DecoratorB extends Decorator {
  private String name = "DecoratorB";
  
  public DecoratorB(Component component) {
    super(component);
  }
  
  public void print() {
    super.print();
    afterPrint();
  }
  
  private void afterPrint() {
    System.out.println(name + " extended after");
  }
}