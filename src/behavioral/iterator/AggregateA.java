import java.util.List;
import java.util.ArrayList;

public class AggregateA implements Aggregate {
  private String name = "AggregateA";
  private List<String> aggregateList = new ArrayList<String>();
  
  public AggregateA() {
    aggregateList.add(name);
    aggregateList.add("One");
    aggregateList.add("Two");
    aggregateList.add("Three");
    aggregateList.add("Four");
    aggregateList.add("Five");
  }
  
  public List<String> getAggregateList() {
    return aggregateList;
  }
  
  public Iterator createIterator() {
    return new IteratorA(this);
  }
}