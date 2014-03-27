package sanq.examole.templates.iterator;

/**
 * Created with IntelliJ IDEA.
 * User: Sanq
 * Date: 24.03.14
 * Time: 11:31
 */
public class Launcher {
    public static void main(String[] args) {
        Waitress waitress = new Waitress( new DinerMenu() , new PancakeHouseMenu());
        waitress.printMenu();

    }

}
