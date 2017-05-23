public class Request {
  private String name = "Request";
  private char type;
  
  public Request(char type) {
    this.type = type;
  }
  
  public char getType() {
    return type;
  }
  
  public void print() {
    System.out.println(name);
  }
}