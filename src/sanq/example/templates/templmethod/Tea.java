package sanq.example.templates.templmethod;

/**
 * Created with IntelliJ IDEA.
 * User: Sanq
 * Date: 21.03.14
 * Time: 15:58
 */
public class Tea extends AbstractBeverage {
    @Override
    protected void brew() {
        System.out.println("Stepping the tea...");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding lemon...");
    }
}
