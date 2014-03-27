package sanq.example.templates.factory;

/**
 * Created with IntelliJ IDEA.
 * User: Sanq
 * Date: 14.03.14
 * Time: 13:11
 */
public class AnimalWord {
    private Herbivore herbivore;
    private Carnivore carnivore;

    public AnimalWord(ContinentFactory continentFactory) {
        this.herbivore = continentFactory.createHerbivore();
        this.carnivore = continentFactory.createCarnivore();
    }

    public void runFoodChain(){
        carnivore.eat(herbivore);
    }

}
