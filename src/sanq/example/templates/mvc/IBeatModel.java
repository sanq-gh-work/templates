package sanq.example.templates.mvc;

/**
 * Created with IntelliJ IDEA.
 * User: Sanq
 * Date: 03.04.14
 * Time: 10:05
 */
public interface IBeatModel {
    void initialize();
    void on();
    void off();
    void setBPM(int bpm);
    int getBPM();
    void registerObserver(IBeatObserver o);
    void removeObserver(IBeatObserver o);
    void registerObserver(IBPMObserver o);
    void removeObserver(IBPMObserver o);
}
