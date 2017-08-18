package behavioral.templatemethod;

public class App {
  public static void main(String[] args) {
    AbstractClass classA = new ClassA();
    classA.templateMethod();
    
    AbstractClass classB = new ClassB();
    classB.templateMethod();
  }
}