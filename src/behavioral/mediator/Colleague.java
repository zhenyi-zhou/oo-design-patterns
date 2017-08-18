package behavioral.mediator;

public interface Colleague {
  public String getName();
  public void send(String message);
  public void print(String message, String colleagueFrom);
}