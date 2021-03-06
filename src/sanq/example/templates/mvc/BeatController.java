package sanq.example.templates.mvc;

/**
 * Created with IntelliJ IDEA.
 * User: Sanq
 * Date: 04.04.14
 * Time: 9:03
 */
public class BeatController implements IController {
    IBeatModel model;
    View view;

    public BeatController(IBeatModel model) {
        this.model = model;
        view = new View(model,this);
        view.createView();
        view.createControls();
        view.disableStopMenuItem();
        view.enableStartMenuItem();
        model.initialize();
    }

    public void start() {
        model.on();
        view.disableStartMenuItem();
        view.enableStopMenuItem();
    }

    public void stop() {
        model.off();
        view.disableStopMenuItem();
        view.enableStartMenuItem();
    }

    public void increaseBPM() {
        model.setBPM(model.getBPM() + 1);
    }

    public void decreaseBPM() {
        model.setBPM(model.getBPM() - 1);
    }

    public void setBPM(int bpm) {
        model.setBPM(bpm);
    }

}
