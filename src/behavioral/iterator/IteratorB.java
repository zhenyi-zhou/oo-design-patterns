package behavioral.iterator;

public class IteratorB implements Iterator {
  private String[] aggregateArray;
  private int length;
  private int index;
  
  public IteratorB(AggregateB aggregateB) {
    this.aggregateArray = aggregateB.getAggregateArray();
    this.length = aggregateArray.length;
  }
  
  public boolean hasNext() {
    if (index < length) {
      return true;
    }
    return false;
  }
  
  public Object next() {
    if (hasNext()) {
      return aggregateArray[index++];
    }
    return null;
  }
}