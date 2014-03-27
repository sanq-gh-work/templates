package sanq.example.templates.adapter;

/**
 * Created with IntelliJ IDEA.
 * User: Sanq
 * Date: 17.03.14
 * Time: 13:22
 */
public class MallardDuck implements Duck {

    @Override
    public void quack() {
        System.out.println("Quack-quack...");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying!");
    }
}
