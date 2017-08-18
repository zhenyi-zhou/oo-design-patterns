package behavioral.iterator;

import java.util.List;

public class IteratorA implements Iterator {
  private List<String> aggregateList;
  private int length;
  private int index;
  
  public IteratorA(AggregateA aggregateA) {
    this.aggregateList = aggregateA.getAggregateList();
    this.length = aggregateList.size();
  }
  
  public boolean hasNext() {
    if (index < length) {
      return true;
    }
    return false;
  }
  
  public Object next() {
    if (hasNext()) {
      return aggregateList.get(index++);
    }
    return null;
  }
}