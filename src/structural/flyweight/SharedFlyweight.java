package structural.flyweight;

public class SharedFlyweight implements Flyweight {
  private String name = "SharedFlyweight";
  private String key;
  
  public SharedFlyweight(String key) {
    this.key = key;
  }
  
  public void print() {
    System.out.println(name + " " + key);
  }
}