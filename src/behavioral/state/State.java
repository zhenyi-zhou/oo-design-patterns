public interface State {
  public String getName();
  public void handle(Context context);
}