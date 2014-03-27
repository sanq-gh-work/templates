package sanq.example.templates.strategy;

/**
 * Created with IntelliJ IDEA.
 * User: Sanq
 * Date: 11.03.14
 * Time: 11:57
 */
public class QuackSqueack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeack - squeack!");
    }
}
