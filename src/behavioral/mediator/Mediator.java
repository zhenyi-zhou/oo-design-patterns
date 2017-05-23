public interface Mediator {
  public void setColleague1(Colleague1 colleague1);
  public void setColleague2(Colleague2 colleague2);
  public void toColleague1(String message);
  public void toColleague2(String message);
}