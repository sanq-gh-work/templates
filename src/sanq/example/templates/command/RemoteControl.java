package sanq.example.templates.command;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * User: Sanq
 * Date: 14.03.14
 * Time: 16:18
 */
public class RemoteControl {
    private ArrayList<Command> onCommands;
    private ArrayList<Command> offCommands;
    private Stack<Command> undoCommands;
    private Command noCmd = new CommandNothing();

    public RemoteControl() {
        onCommands = new ArrayList<Command>();
        offCommands = new ArrayList<Command>();
        undoCommands = new Stack<Command>();
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands.add(slot, onCommand);
        offCommands.add(slot, offCommand);
    }

    public void onButtonWasPressed(int slot) {
        onCommands.get(slot).execute();
        undoCommands.push(onCommands.get(slot));
    }

    public void offButtonWasPressed(int slot) {
        offCommands.get(slot).execute();
        undoCommands.push(offCommands.get(slot));
    }

    public void undoButtonWasPressed() {
        if (!undoCommands.empty()) {
            undoCommands.pop().undo();
        }
    }

    @Override
    public String toString() {
        return "RemoteControl{" +
                "\nonCommands=" + onCommands +
                "\noffCommands=" + offCommands +
                "\n}";
    }
}
