import java.util.List;
import java.util.ArrayList;

public class Invoker {
  private String name = "Invoker";
  private List<Command> commandList = new ArrayList<Command>();
  
  public void doCommand(Command command) {
    commandList.add(command);
    command.execute(name);
  }
}