package structural.composite;

public class App {
  public static void main(String[] args) {
    Leaf leaf1 = new Leaf();
    Leaf leaf2 = new Leaf();
    Leaf leaf3 = new Leaf();
    Leaf leaf4 = new Leaf();
    
    Composite composite1 = new Composite();
    Composite composite2 = new Composite();
    Composite root = new Composite();
    
    composite1.add(leaf1);
    composite1.add(leaf2);
    composite1.add(leaf3);
    
    composite2.add(leaf4);
    
    root.add(composite1);
    root.add(composite2);
    
    root.print();
  }
}