public class App {
  public static void main(String[] args) {
    Component componentA = new DecoratorB(new DecoratorA(new ComponentA()));
    componentA.print();
    
    Component componentB = new DecoratorA(new DecoratorB(new ComponentB()));
    componentB.print();
  }
}