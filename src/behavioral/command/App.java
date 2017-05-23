public class App {
  public static void main(String[] args) {
    Receiver receiver = new Receiver();
    
    Command commandA = new CommandA(receiver);
    Command commandB = new CommandB(receiver);
    
    Invoker invoker = new Invoker();
    invoker.doCommand(commandA);
    invoker.doCommand(commandB);
  }
}