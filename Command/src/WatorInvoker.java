import java.util.ArrayList;

public class WatorInvoker {
    private ArrayList<Command> commands = null;

    public WatorInvoker() {
        commands = new ArrayList<Command>();
    }

    public void SetCommand(Command cmd){
        commands.add(cmd);
    }
    public void OrderUp(){
        System.out.println("ÓÐ¶©µ¥");
        for (Command cmd:commands){
            if (cmd != null){
                cmd.execute();
            }
        }
    }
}
