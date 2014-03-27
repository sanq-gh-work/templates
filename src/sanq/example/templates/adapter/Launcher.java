package sanq.example.templates.adapter;

/**
 * Created with IntelliJ IDEA.
 * User: Sanq
 * Date: 17.03.14
 * Time: 13:32
 */
public class Launcher {
    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();
        WildTurkey turkey = new WildTurkey();

        Duck adapterTurkeyToDuck = new AdapterTurkey(turkey);

        System.out.println("adapterTurkey says:");
        adapterTurkeyToDuck.quack();
        adapterTurkeyToDuck.fly();

    }
}
