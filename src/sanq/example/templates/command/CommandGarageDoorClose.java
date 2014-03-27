package sanq.example.templates.command;

/**
 * Created with IntelliJ IDEA.
 * User: Sanq
 * Date: 14.03.14
 * Time: 16:30
 */
public class CommandGarageDoorClose implements Command{
    private GarageDoor door;

    public CommandGarageDoorClose(GarageDoor door) {
        this.door = door;
    }
    @Override
    public void execute() {
        door.down();
        door.stop();
        door.lightOff();
    }

    @Override
    public void undo() {
        new CommandGarageDoorOpen(door).execute();
    }
}
