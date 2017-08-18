package behavioral.templatemethod;

public abstract class AbstractClass {
  public final void templateMethod() {
    doProcessA();
    doProcessB();
    doProcessC();
  }
  
  public abstract void doProcessA();
  public abstract void doProcessB();
  public abstract void doProcessC();
}