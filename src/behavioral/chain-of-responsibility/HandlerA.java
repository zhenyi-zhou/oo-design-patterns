public class HandlerA extends Handler {
  private String name = "HandlerA";
  
  public void handleRequest(Request request) {
    if (request.getType() == 'A') {
      System.out.println(name + " approved");
      request.print();
    } else {
      System.out.println(name + " rejected");
      successor.handleRequest(request);
    }
  }
}