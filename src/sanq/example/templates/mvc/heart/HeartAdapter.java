package sanq.example.templates.mvc.heart;

import sanq.example.templates.mvc.IBPMObserver;
import sanq.example.templates.mvc.IBeatModel;
import sanq.example.templates.mvc.IBeatObserver;

/**
 * Created with IntelliJ IDEA.
 * User: Sanq
 * Date: 04.04.14
 * Time: 12:25
 */
public class HeartAdapter implements IBeatModel {
    private IHeartModel  heartModel;


    public HeartAdapter(IHeartModel heartModel) {
        this.heartModel = heartModel;
    }

    @Override
    public void initialize() {
               /*NOP*/
    }

    @Override
    public void on() {
       /*NOP*/
    }

    @Override
    public void off() {
       /*NOP*/
    }

    @Override
    public void setBPM(int bpm) {
       /*NOP*/
    }

    @Override
    public int getBPM() {
        return heartModel.getHeartRate();
    }

    @Override
    public void registerObserver(IBeatObserver o) {
        heartModel.registerObserver(o);
    }

    @Override
    public void removeObserver(IBeatObserver o) {
         heartModel.removeObserver(o);
    }

    @Override
    public void registerObserver(IBPMObserver o) {
        heartModel.registerObserver(o);
    }

    @Override
    public void removeObserver(IBPMObserver o) {
        heartModel.removeObserver(o);
    }
}
