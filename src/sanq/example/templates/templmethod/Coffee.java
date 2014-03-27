package sanq.example.templates.templmethod;

/**
 * Created with IntelliJ IDEA.
 * User: Sanq
 * Date: 21.03.14
 * Time: 15:56
 */
public class Coffee extends AbstractBeverage{

    @Override
    protected void brew() {
        System.out.println("Dripping coffee through filter...");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding sugar and milk...");
    }
}
