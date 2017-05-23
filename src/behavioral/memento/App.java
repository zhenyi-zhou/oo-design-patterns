public class App {
  public static void main(String[] args) {
    Originator originator = new Originator();
    CareTaker careTaker = new CareTaker();
    
    originator.setState("#1");
    careTaker.addMemento(originator.createMemento());
    originator.print();
    
    originator.setState("#2");
    careTaker.addMemento(originator.createMemento());
    originator.print();
    
    originator.setState("#3");
    careTaker.addMemento(originator.createMemento());
    originator.print();
    
    careTaker.getMemento(0).print();
    careTaker.getMemento(1).print();
    careTaker.getMemento(2).print();
  }
}