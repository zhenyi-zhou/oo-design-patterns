package behavioral.mediator;

public class App {
  public static void main(String[] args) {
      Mediator mediatorA = new MediatorA();
      
      Colleague1 colleague1 = new Colleague1(mediatorA);
      Colleague2 colleague2 = new Colleague2(mediatorA);
      
      mediatorA.setColleague1(colleague1);
      mediatorA.setColleague2(colleague2);
      
      colleague1.send("Hello Colleague2");
      colleague2.send("Hello Colleague1");
  }
}