package creational.builder;

public class ProductBuilder implements Builder {
  private String name = "ProductBuilder";
  private Product product;
  
  public ProductBuilder() {
    product = new Product();
  }
  
  public String getName() {
    return name;
  }
  
  public void buildComponent1(String component1) {
    product.setComponent1(component1);
  }
  
  public void buildComponent2(String component2) {
    product.setComponent2(component2);
  }
  
  public void buildComponent3(String component3) {
    product.setComponent3(component3);
  }
  
  public Product getProduct() {
    return product;
  }
}