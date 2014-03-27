package sanq.example.templates.decorator;

/**
 * Created with IntelliJ IDEA.
 * User: Sanq
 * Date: 12.03.14
 * Time: 11:38
 */
public class Decaf extends AbstractBeverage {

    public Decaf() {
        description = "Decaf";
    }

    @Override
    public double cost() {
        return 1.3;
    }
}
