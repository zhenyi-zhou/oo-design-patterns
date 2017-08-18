package behavioral.strategy;

public class Context {
  private String name = "Context";
  private Strategy strategy;
  
  public void setStrategy(Strategy strategy) {
    this.strategy = strategy;
  }
  
  public void doCalculation() {
    strategy.execute(name);
  }
}