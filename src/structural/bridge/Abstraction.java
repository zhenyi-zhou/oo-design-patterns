public abstract class Abstraction {
  protected Implementor implementor;
  
  protected Abstraction(final Implementor implementor) {
    this.implementor = implementor;
  }
  
  public abstract void print();
}