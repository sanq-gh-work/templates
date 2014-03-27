package sanq.example.templates.command;

/**
 * Created with IntelliJ IDEA.
 * User: Sanq
 * Date: 14.03.14
 * Time: 16:09
 */
public interface Command {
    public void execute();
    public void undo();

}
