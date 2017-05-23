public class Facade {
  private SystemA systemA;
  private SystemB systemB;
  private SystemC systemC;
  
  public Facade() {
    this.systemA = new SystemA();
    this.systemB = new SystemB();
    this.systemC = new SystemC();
  }
  
  public void printA() {
    systemA.print();
  }
  
  public void printB() {
    systemB.print();
  }
  
  public void printC() {
    systemC.print();
  }
  
  public void printAll() {
    printA();
    printB();
    printC();
  }
}