public class ExpressionB implements Expression {
  private String name = "ExpressionB";
  
  public void interpret(Context context) {
    System.out.println(context.getContext() + " interpreted by " + name);
  }
}