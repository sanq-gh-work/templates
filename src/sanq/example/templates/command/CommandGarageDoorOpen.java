package sanq.example.templates.command;

/**
 * Created with IntelliJ IDEA.
 * User: Sanq
 * Date: 14.03.14
 * Time: 16:30
 */
public class CommandGarageDoorOpen implements Command{
    private GarageDoor door;

    public CommandGarageDoorOpen(GarageDoor door) {
        this.door = door;
    }
    @Override
    public void execute() {
        door.lightOn();
        door.up();
        door.stop();
    }

    @Override
    public void undo() {
        new CommandGarageDoorClose(door).execute();
    }
}
