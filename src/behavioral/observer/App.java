package behavioral.observer;

public class App {
  public static void main(String[] args) {
    Subject subject = new Subject();
    
    new ObserverA(subject);
    new ObserverB(subject);
    
    subject.changeState(1);
    subject.changeState(2);
  }
}