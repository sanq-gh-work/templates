package sanq.example.templates.state;

/**
 * Created with IntelliJ IDEA.
 * User: Sanq
 * Date: 25.03.14
 * Time: 12:08
 */
public interface State {
    public void insertQuarter();
    public void ejectQuarter();
    public void tumCrank();
    public void dispense();
}
