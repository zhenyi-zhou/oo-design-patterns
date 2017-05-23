public class Proxy implements Subject {
  private String name = "Proxy";
  private RealSubject realSubject;
  
  private RealSubject getRealSubject() {
    if (realSubject == null) {
      realSubject = new RealSubject();
    }
    return realSubject;
  }
  
  public void print() {
    System.out.println(name + " start");
    getRealSubject().print();
    System.out.println(name + " end");
  }
}