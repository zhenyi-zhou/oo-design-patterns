package behavioral.iterator;

public class AggregateB implements Aggregate {
  private String name = "AggregateB";
  private String[] aggregateArray = {name, "First",  "Second",  "Third",  "Fourth",  "Fifth"};
  
  public String[] getAggregateArray() {
    return aggregateArray;
  }
  
  public Iterator createIterator() {
    return new IteratorB(this);
  }
}