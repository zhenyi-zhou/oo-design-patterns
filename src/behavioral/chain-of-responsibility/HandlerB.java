public class HandlerB extends Handler {
  private String name = "HandlerB";
  
  public void handleRequest(Request request) {
    if (request.getType() == 'B') {
      System.out.println(name + " approved");
      request.print();
    } else {
      System.out.println(name + " rejected");
      successor.handleRequest(request);
    }
  }
}