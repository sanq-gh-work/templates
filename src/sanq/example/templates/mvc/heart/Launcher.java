package sanq.example.templates.mvc.heart;

import sanq.example.templates.mvc.BeatController;
import sanq.example.templates.mvc.BeatModel;
import sanq.example.templates.mvc.IBeatModel;
import sanq.example.templates.mvc.IController;

/**
 * Created with IntelliJ IDEA.
 * User: Sanq
 * Date: 04.04.14
 * Time: 12:56
 */
public class Launcher {
    public static void main(String[] args) {
        IHeartModel model = new HeartModel();
        IController controller = new HeartController(model);

    }
}
