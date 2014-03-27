package sanq.examole.templates.iterator;

/**
 * Created with IntelliJ IDEA.
 * User: Sanq
 * Date: 24.03.14
 * Time: 11:19
 */
public class Waitress {
    private Menu dinerMenu;
    private Menu pancakeHouseMenu;

    public Waitress(Menu dinerMenu, Menu pancakeHouseMenu) {
        this.dinerMenu = dinerMenu;
        this.pancakeHouseMenu = pancakeHouseMenu;
    }

    public void printMenu() {
        System.out.println("MENU\n-----\nBREAKFAST");
        printMenu(pancakeHouseMenu.getIterator());
        System.out.println("\nLUNCH");
        printMenu(dinerMenu.getIterator());
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.println(menuItem.getName() + ", " + menuItem.getPrice() + "  --  " + menuItem.getDescription());
        }
    }
}
