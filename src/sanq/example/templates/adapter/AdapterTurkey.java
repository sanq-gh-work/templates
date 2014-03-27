package sanq.example.templates.adapter;

/**
 * Created with IntelliJ IDEA.
 * User: Sanq
 * Date: 17.03.14
 * Time: 13:27
 */
public class AdapterTurkey implements Duck {
    private Turkey turkey;

    public AdapterTurkey(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
       turkey.gobble();
    }

    @Override
    public void fly() {
        // flying a long distance
        for (int i= 0; i<5;i++){
           turkey.fly();
        }
    }
}
