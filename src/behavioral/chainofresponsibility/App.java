package behavioral.chainofresponsibility;

public class App {
  public static void main(String[] args) {
    Handler handlerA = new HandlerA();
    Handler handlerB = new HandlerB();
    Handler handlerC = new HandlerC();
    
    handlerA.setSuccessor(handlerB);
    handlerB.setSuccessor(handlerC);
    
    handlerA.handleRequest(new Request('A'));
    handlerA.handleRequest(new Request('B'));
    handlerA.handleRequest(new Request('C'));
  }
}