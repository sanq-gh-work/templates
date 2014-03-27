package sanq.example.templates.strategy;

/**
 * Created with IntelliJ IDEA.
 * User: Sanq
 * Date: 11.03.14
 * Time: 11:48
 */
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {
    }
    public abstract void display();

    public void setFlyBehavior(FlyBehavior fb ){
        flyBehavior = fb;
    }

    public void setQuckBehavior(QuackBehavior qb ){
        quackBehavior = qb;
    }



    public void perfomFly(){
        flyBehavior.fly();
    }
    public void perfomQuack(){
        quackBehavior.quack();
    }
    public void swim(){
        System.out.println("All ducks float, even decoys!");
    }

}
