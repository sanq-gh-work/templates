package sanq.example.templates.decorator;

/**
 * Created with IntelliJ IDEA.
 * User: Sanq
 * Date: 12.03.14
 * Time: 11:38
 */
public class Espresso extends AbstractBeverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
