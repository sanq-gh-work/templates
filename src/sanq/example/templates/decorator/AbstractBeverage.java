package sanq.example.templates.decorator;

/**
 * Created with IntelliJ IDEA.
 * User: Sanq
 * Date: 12.03.14
 * Time: 11:21
 */
public abstract class AbstractBeverage {
    protected String description  = "Unknown Beverage";

    public abstract double cost();

    public String getDescription() {
        return description;
    }
}
