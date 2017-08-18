package behavioral.mediator;

public class Colleague1 implements Colleague {
  private String name = "Colleague1";
  private Mediator mediator;
  
  public Colleague1(Mediator mediator) {
    this.mediator = mediator;
  }
  
  public String getName() {
    return name;
  }
  
  public void send(String message) {
    mediator.toColleague2(message);
  }
  
  public void print(String message, String colleagueFrom) {
    System.out.println(name + " received message from " + colleagueFrom + ": " + message);
  }
}