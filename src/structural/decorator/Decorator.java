public abstract class Decorator implements Component {
  protected Component component;
  
  public Decorator(Component component) {
    this.component = component;
  }
  
  public void print() {
    component.print();
  }
}