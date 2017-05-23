public class Colleague2 implements Colleague {
  private String name = "Colleague2";
  private Mediator mediator;
  
  public Colleague2(Mediator mediator) {
    this.mediator = mediator;
  }
  
  public String getName() {
    return name;
  }
  
  public void send(String message) {
    mediator.toColleague1(message);
  }
  
  public void print(String message, String colleagueFrom) {
    System.out.println(name + " received message from " + colleagueFrom + ": " + message);
  }
}