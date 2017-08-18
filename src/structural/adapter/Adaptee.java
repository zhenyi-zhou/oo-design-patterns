package structural.adapter;

public class Adaptee {
  private String name = "Adaptee";
  
  public void print() {
    System.out.println(name + " is requested");
  }
}