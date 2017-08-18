package behavioral.strategy;

public class StrategyB implements Strategy {
  private String name = "StrategyB";
  
  public void execute(String contextName) {
    System.out.println(contextName + " used " + name + " as algorithm");
  }
}