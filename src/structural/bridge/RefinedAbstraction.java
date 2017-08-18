package structural.bridge;

public class RefinedAbstraction extends Abstraction {
  public RefinedAbstraction(final Implementor implementor) {
    super(implementor);
  }
  
  public void print() {
    implementor.print();
  }
}