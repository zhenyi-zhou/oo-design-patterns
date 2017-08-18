package behavioral.memento;

import java.util.List;
import java.util.ArrayList;

public class CareTaker {
  private List<Memento> mementoList = new ArrayList<Memento>();
  
  public void addMemento(Memento memento) {
    mementoList.add(memento);
  }
  
  public Memento getMemento(int index) {
    System.out.println("Get memento " + ( index + 1 ) + ":");
    return mementoList.get(index);
  }
}