package sanq.example.templates.mvc;

/**
 * Created with IntelliJ IDEA.
 * User: Sanq
 * Date: 03.04.14
 * Time: 11:34
 */
public interface ControllerInterface {

    void start();
    void stop();
    void increaseBPM();
    void decreaseBPM();
    void setBPM(int bpm);



}
