package sanq.example.templates.mvc.heart;

import sanq.example.templates.mvc.IBPMObserver;
import sanq.example.templates.mvc.IBeatObserver;

/**
 * Created with IntelliJ IDEA.
 * User: Sanq
 * Date: 04.04.14
 * Time: 12:23
 */
public interface IHeartModel {
    public int getHeartRate();
    void registerObserver(IBeatObserver o);
    void registerObserver(IBPMObserver o);
    void removeObserver(IBeatObserver o);
    void removeObserver(IBPMObserver o);

}
