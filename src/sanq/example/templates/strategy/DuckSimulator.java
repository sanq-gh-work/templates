package sanq.example.templates.strategy;

/**
 * Created with IntelliJ IDEA.
 * User: Sanq
 * Date: 11.03.14
 * Time: 12:03
 */
public class DuckSimulator {
    public static void main(String[] args) {
        Duck mallardDuck  = new MallardDuck();
        mallardDuck.perfomFly();
        mallardDuck.perfomQuack();

        Duck modelDuck = new ModelDuck();
        modelDuck.perfomFly();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.perfomFly();

    }
}
