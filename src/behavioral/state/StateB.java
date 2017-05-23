public class StateB implements State {
  private String name = "StateB";
  
  public String getName() {
    return name;
  }
  
  public void handle(Context context) {
    System.out.println(context.getName() + " handled in " + name);
    context.setState(new StateC());
  }
}