package sanq.example.templates.decorator;

/**
 * Created with IntelliJ IDEA.
 * User: Sanq
 * Date: 12.03.14
 * Time: 11:38
 */
public class HoseBlend extends AbstractBeverage {

    public HoseBlend() {
        description = "Hose Blend Coffee";
    }

    @Override
    public double cost() {
        return .89;
    }
}
