package sanq.example.templates.decorator;

/**
 * Created with IntelliJ IDEA.
 * User: Sanq
 * Date: 12.03.14
 * Time: 12:01
 */
public class StartbuzzCoffee {
    public static void main(String[] args) {
        AbstractBeverage beverage = new DarkRoast();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        AbstractBeverage beverage1 = new Espresso();
        beverage1 = new MochaDec(beverage1);
        beverage1 = new SoyDec(beverage1);
        beverage1 = new WhipDec(beverage1);
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());

        AbstractBeverage beverage2 = new Decaf();
        beverage2 = new WhipDec(beverage2);
        beverage2 = new WhipDec(beverage2);
        beverage2 = new WhipDec(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

    }
}
