package creational.abstractfactory;

public interface Factory {
  public String getName();
  public ProductA createProductA();
  public ProductB createProductB();
}