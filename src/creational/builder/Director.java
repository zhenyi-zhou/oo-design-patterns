public class Director {
  private String name = "Director";
  private Builder builder;
  
  public Director(Builder builder) {
    this.builder = builder;
  }
  
  public String getName() {
    return name;
  }
  
  public Product construct() {
    builder.buildComponent1("Component1");
    builder.buildComponent2("Component2");
    builder.buildComponent3("Component3");
    
    return builder.getProduct();
  }
}