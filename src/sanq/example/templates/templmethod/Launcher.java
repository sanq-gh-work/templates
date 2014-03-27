package sanq.example.templates.templmethod;

/**
 * Created with IntelliJ IDEA.
 * User: Sanq
 * Date: 21.03.14
 * Time: 16:04
 */
public class Launcher {
    public static void main(String[] args) {
        System.out.println("-------------Tea----------------");
        AbstractBeverage tea  = new Tea();
        tea.prepareRecipe();

        System.out.println("-------------Coffee----------------");
        AbstractBeverage coffee  = new Coffee();
        coffee.prepareRecipe();


    }
}
