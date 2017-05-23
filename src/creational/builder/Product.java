public class Product {
  private String name = "ProductA";
  private String component1;
  private String component2;
  private String component3;
  
  public void setComponent1(String component1) {
    this.component1 = component1;
  }
  
  public void setComponent2(String component2) {
    this.component2 = component2;
  }
  
  public void setComponent3(String component3) {
    this.component3 = component3;
  }
  
  public void print(String directorName, String builderName) {
    System.out.println(directorName+ " used " + builderName + " to construct " +
        name + " with " + component1 + ", " + component2 + ", " + component3);
  }
}