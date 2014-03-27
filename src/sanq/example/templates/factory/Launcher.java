package sanq.example.templates.factory;

/**
 * Created with IntelliJ IDEA.
 * User: Sanq
 * Date: 14.03.14
 * Time: 13:31
 */
public class Launcher {
    public static void main(String[] args) {
        ContinentFactory africa = new AfricaFactory();
        AnimalWord word = new AnimalWord(africa);
        word.runFoodChain();

        ContinentFactory america = new AmericaFactory();
        word = new AnimalWord(america);
        word.runFoodChain();


    }
}
