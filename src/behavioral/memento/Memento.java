public class Memento {
  private String name = "Memento";
  private String state;
  
  public Memento(String state) {
    this.state = state;
  }
  
  public String getState() {
    return state;
  }
  
  public void print() {
    System.out.println(name + " state: " + state);
  }
}