public class StateA implements State {
  private String name = "StateA";
  
  public String getName() {
    return name;
  }
  
  public void handle(Context context) {
    System.out.println(context.getName() + " handled in " + name);
    context.setState(new StateB());
  }
}