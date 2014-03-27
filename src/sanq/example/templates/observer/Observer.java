package sanq.example.templates.observer;

/**
 * Created with IntelliJ IDEA.
 * User: Sanq
 * Date: 11.03.14
 * Time: 16:10
 */
public interface Observer {
    public void update(float temp, float humidity, float pressure);
}
