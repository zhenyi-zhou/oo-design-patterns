public class HandlerC extends Handler {
  private String name = "HandlerC";
  
  public void handleRequest(Request request) {
    if (request.getType() == 'C') {
      System.out.println(name + " approved");
      request.print();
    } else {
      System.out.println(name + " rejected");
      successor.handleRequest(request);
    }
  }
}