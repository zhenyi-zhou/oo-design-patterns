public class CommandA implements Command {
  private Receiver receiver;
  
  public CommandA(Receiver receiver) {
    this.receiver = receiver;
  }
  
  public void execute(String invokerName) {
    receiver.doCommandA(invokerName);
  }
}