package sanq.example.templates.factory;

/**
 * Created with IntelliJ IDEA.
 * User: Sanq
 * Date: 14.03.14
 * Time: 13:09
 */
public class Wolf extends Carnivore {

    @Override
    public void eat(Herbivore h) {
        String eat_string = String.format("%s eats %s",getClass().getSimpleName(),h.getClass().getSimpleName());
        System.out.println(eat_string);
    }
}
