package structural.adapter;

public class App {
  public static void main(String[] args) {
    Adaptee adaptee = new Adaptee();
    Target target = new Adapter(adaptee);
    target.request();
  }
}