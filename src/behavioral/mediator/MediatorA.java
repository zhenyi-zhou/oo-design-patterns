public class MediatorA implements Mediator {
  private Colleague1 colleague1;
  private Colleague2 colleague2;
  
  public void setColleague1(Colleague1 colleague1) {
    this.colleague1 = colleague1;
  }
  
  public void setColleague2(Colleague2 colleague2) {
    this.colleague2 = colleague2;
  }
  
  public void toColleague1(String message) {
    System.out.println(colleague2.getName() + " sent message to " +
        colleague1.getName() + ": " + message);
    colleague1.print(message, colleague2.getName());
  }
  
  public void toColleague2(String message) {
    System.out.println(colleague1.getName() + " sent message to " +
        colleague2.getName() + ": " + message);
    colleague2.print(message, colleague1.getName());
  }
}