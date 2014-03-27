package sanq.example.templates.decorator;

/**
 * Created with IntelliJ IDEA.
 * User: Sanq
 * Date: 12.03.14
 * Time: 11:38
 */
public class DarkRoast extends AbstractBeverage {

    public DarkRoast() {
        description = "Dark Roast Coffee";
    }

    @Override
    public double cost() {
        return 2.5;
    }
}
