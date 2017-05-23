public class StateC implements State {
  private String name = "StateC";
  
  public String getName() {
    return name;
  }
  
  public void handle(Context context) {
    System.out.println(context.getName() + " handled in " + name);
    System.out.println(context.getName() + " done");
  }
}