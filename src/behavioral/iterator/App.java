public class App {
  public static void main(String[] args) {
    AggregateA aggregateA = new AggregateA();
    for (Iterator iteratorA = aggregateA.createIterator(); iteratorA.hasNext(); ) {
      System.out.println(iteratorA.next());
    }
    
    AggregateB aggregateB = new AggregateB();
    for (Iterator iteratorB = aggregateB.createIterator(); iteratorB.hasNext(); ) {
      System.out.println(iteratorB.next());
    }
  }
}