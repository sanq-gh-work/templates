package sanq.example.templates.adapter;

/**
 * Created with IntelliJ IDEA.
 * User: Sanq
 * Date: 17.03.14
 * Time: 13:25
 */
public class WildTurkey implements Turkey {

    @Override
    public void gobble() {
        System.out.println("Gobble-gobble...");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying a short distance...");
    }
}
