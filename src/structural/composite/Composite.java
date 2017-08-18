package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {
  private List<Component> childComponents = new ArrayList<Component>();
  
  public void add(Component component) {
    childComponents.add(component);
  }
  
  public void remove(Component component) {
    childComponents.remove(component);
  }
  
  public void print() {
    for (Component component : childComponents) {
      component.print();
    }
  }
}