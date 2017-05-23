public class ExpressionA implements Expression {
  private String name = "ExpressionA";
  
  public void interpret(Context context) {
    System.out.println(context.getContext() + " interpreted by " + name);
  }
}