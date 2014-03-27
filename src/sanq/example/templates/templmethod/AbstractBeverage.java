package sanq.example.templates.templmethod;

/**
 * Created with IntelliJ IDEA.
 * User: Sanq
 * Date: 21.03.14
 * Time: 15:52
 */
public abstract class AbstractBeverage {
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    protected abstract void brew();

    protected abstract void addCondiments();

    private void pourInCup() {
        System.out.println("Pouring into cup...");

    }

    private void boilWater() {
        System.out.println("Boiling water ...");
    }


}
