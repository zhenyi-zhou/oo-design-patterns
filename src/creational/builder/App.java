package creational.builder;

public class App {
  public static void main(String[] args) {
    Builder builder = new ProductBuilder();
    Director director = new Director(builder);
    Product product = director.construct();
    product.print(director.getName(), builder.getName());
  }
}