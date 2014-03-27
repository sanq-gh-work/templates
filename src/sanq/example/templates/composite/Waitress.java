package sanq.example.templates.composite;

/**
 * Created with IntelliJ IDEA.
 * User: Sanq
 * Date: 24.03.14
 * Time: 11:19
 */
public class Waitress {
    private  MenuComponent allMenu;

    public Waitress(MenuComponent allMenu) {
        this.allMenu = allMenu;
    }

    public void printMenu() {
        allMenu.print();
    }

}
