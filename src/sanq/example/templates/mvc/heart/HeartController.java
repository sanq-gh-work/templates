package sanq.example.templates.mvc.heart;

import sanq.example.templates.mvc.IBeatModel;
import sanq.example.templates.mvc.IController;
import sanq.example.templates.mvc.View;

/**
 * Created with IntelliJ IDEA.
 * User: Sanq
 * Date: 04.04.14
 * Time: 12:33
 */
public class HeartController implements IController {
    IHeartModel model;
    View view;


    public HeartController(IHeartModel model) {
        this.model = model;
        view = new View( new HeartAdapter(model) ,this);
        view.createView();
        view.createControls();
        view.disableStopMenuItem();
        view.enableStartMenuItem();
    }

    @Override
    public void start() {
       /*NOP*/
    }

    @Override
    public void stop() {
                   /*NOP*/

    }

    @Override
    public void increaseBPM() {
       /*NOP*/

    }

    @Override
    public void decreaseBPM() {
       /*NOP*/

    }

    @Override
    public void setBPM(int bpm) {
       /*NOP*/

    }
}
