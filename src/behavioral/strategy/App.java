public class App {
  public static void main(String[] args) {
    Context context = new Context();
    
    context.setStrategy(new StrategyA());
    context.doCalculation();
    
    context.setStrategy(new StrategyB());
    context.doCalculation();
  }
}