package behavioral.memento;

public class Originator {
  private String name = "Originator";
  private String state;
  
  public Memento createMemento() {
    return new Memento(state);
  }
  
  public void setState(String state) {
    this.state = state;
  }
  
  public void print() {
    System.out.println(name + " state: " + state);
  }
}