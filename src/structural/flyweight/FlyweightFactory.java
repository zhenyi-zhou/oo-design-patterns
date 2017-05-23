import java.util.HashMap;

public class FlyweightFactory {
  private static final HashMap<String, Flyweight> flyweightMap = new HashMap<String, Flyweight>();
  
  public Flyweight createFlyweight(String key) {
    if (!flyweightMap.containsKey(key)) {
      flyweightMap.put(key, new SharedFlyweight(key));
    } else {
      System.out.println("Flyweight " + key + " exists");
    }
    return flyweightMap.get(key);
  }
}