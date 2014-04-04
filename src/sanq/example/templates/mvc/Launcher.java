package sanq.example.templates.mvc;

/**
 * Created with IntelliJ IDEA.
 * User: Sanq
 * Date: 04.04.14
 * Time: 9:00
 */
public class Launcher {
    public static void main(String[] args) {

        IBeatModel model = new BeatModel();
        IController controller = new BeatController(model);
    }

}
