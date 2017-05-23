public class StrategyA implements Strategy {
  private String name = "StrategyA";
  
  public void execute(String contextName) {
    System.out.println(contextName + " used " + name + " as algorithm");
  }
}