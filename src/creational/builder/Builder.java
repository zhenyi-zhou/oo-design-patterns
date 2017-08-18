package creational.builder;

public interface Builder {
  public String getName();
  void buildComponent1(String component1);
  void buildComponent2(String component2);
  void buildComponent3(String component3);
  Product getProduct();
}