public class CommandB implements Command {
  private Receiver receiver;
  
  public CommandB(Receiver receiver) {
    this.receiver = receiver;
  }
  
  public void execute(String invokerName) {
    receiver.doCommandB(invokerName);
  }
}