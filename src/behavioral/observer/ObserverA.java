package behavioral.observer;

import java.util.Observable;
import java.util.Observer;

public class ObserverA implements Observer {
  private String name = "ObserverA";
  private Subject subject;
  
  public ObserverA(Subject subject) {
    this.subject = subject;
    this.subject.addObserver(this);
  }
  
  public void update(Observable obs, Object obj) {
    System.out.println(name + " state updated " + subject.getState());
  }
}