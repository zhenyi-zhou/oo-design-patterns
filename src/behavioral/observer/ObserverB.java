package behavioral.observer;

import java.util.Observable;
import java.util.Observer;

public class ObserverB implements Observer {
  private String name = "ObserverB";
  private Subject subject;
  
  public ObserverB(Subject subject) {
    this.subject = subject;
    this.subject.addObserver(this);
  }
  
  public void update(Observable obs, Object obj) {
    System.out.println(name + " state updated " + subject.getState());
  }
}