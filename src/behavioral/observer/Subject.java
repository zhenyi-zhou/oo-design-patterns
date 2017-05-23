import java.util.Observable;

public class Subject extends Observable {
  private int state;
  
  public void setState(int state) {
    this.state = state;
  }
  
  public int getState() {
    return state;
  }
  
  public void changeState(int state) {
    setState(state);
    setChanged();
    notifyObservers();
  }
}