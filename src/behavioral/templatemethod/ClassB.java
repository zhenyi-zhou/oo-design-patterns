package behavioral.templatemethod;

public class ClassB extends AbstractClass {
  private String name = "ClassB";
  
  public void doProcessA() {
    System.out.println(name + " do process A");
  }
  
  public void doProcessB() {
    System.out.println(name + " do process B");
  }
  
  public void doProcessC() {
    System.out.println(name + " do process C");
  }
}