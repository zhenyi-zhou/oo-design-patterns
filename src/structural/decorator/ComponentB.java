package structural.decorator;

public class ComponentB implements Component {
  private String name = "ComponentB";
  
  public void print() {
    System.out.println(name);
  }
}