package behavioral.state;

public class Context {
  private String name = "Context";
  private State state;
  
  public Context() {
    state = new StateA();
    System.out.println("Set " + name + " state: " + state.getName());
  }
  
  public String getName() {
    return name;
  }
  
  public void setState(State state) {
    this.state = state;
    System.out.println("Set context state: " + state.getName());
  }
  
  public void request() {
    state.handle(this);
  }
}