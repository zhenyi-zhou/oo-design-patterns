package behavioral.interpreter;

public class App {
  public static void main(String[] args) {
    Expression expressionA = new ExpressionA();
    expressionA.interpret(new Context());
    
    Expression expressionB = new ExpressionB();
    expressionB.interpret(new Context());
  }
}