package sanq.example.templates.command;

/**
 * Created with IntelliJ IDEA.
 * User: Sanq
 * Date: 14.03.14
 * Time: 16:21
 */
public class Launcher{

    public static void main(String[] args) {
        RemoteControl control = new RemoteControl();

        Light light = new Light();
        CommandLightOn lightOnCmd = new CommandLightOn(light);
        CommandLightOff lightOffCmd = new CommandLightOff(light);

        control.setCommand(0,lightOnCmd,lightOffCmd);
        control.onButtonWasPressed(0);
        System.out.println(".......................");
        control.offButtonWasPressed(0);
        System.out.println(".......................");
        GarageDoor door = new GarageDoor();
        CommandGarageDoorOpen cmdDoorOpen = new CommandGarageDoorOpen(door) ;
        CommandGarageDoorClose cmdDoorClose = new CommandGarageDoorClose(door) ;
        control.setCommand(1,cmdDoorOpen,cmdDoorClose);
        control.onButtonWasPressed(1);
        System.out.println(".......................");
        control.offButtonWasPressed(1);
        System.out.println(".......................");
        System.out.println(".......................");
        System.out.println(".......................");
        control.undoButtonWasPressed();
        control.undoButtonWasPressed();
        control.undoButtonWasPressed();
        control.undoButtonWasPressed();
        control.undoButtonWasPressed();

        System.out.println(".......................");
        System.out.println(control.toString());

    }
}
