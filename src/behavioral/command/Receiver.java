public class Receiver {
  private String name = "Receiver";
  
  public void doCommandA(String invokerName) {
    System.out.println(invokerName + " asked " + name + " to execute Command A");
  }
  
  public void doCommandB(String invokerName) {
    System.out.println(invokerName + " asked " + name + " to execute Command B");
  }
}