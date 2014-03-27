package sanq.example.templates.factory;

/**
 * Created with IntelliJ IDEA.
 * User: Sanq
 * Date: 14.03.14
 * Time: 12:54
 */
public class AmericaFactory extends ContinentFactory {
    @Override
    public Herbivore createHerbivore() {
        return new Bison();
    }

    @Override
    public Carnivore createCarnivore() {
        return new Wolf();
    }
}
