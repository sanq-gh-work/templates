package sanq.examole.templates.iterator;

/**
 * Created with IntelliJ IDEA.
 * User: Sanq
 * Date: 24.03.14
 * Time: 10:46
 */
public class DinerMenu implements Menu{
    static final int MAX_ITEMS = 6;
    private int numberOffItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("Vegetarian BLT", "(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99);
        addItem("BLT", "Bacon with lettuce & tomato on whole wheat", false, 2.99);
        addItem("Soup of the day", "Soup of the day, with a side of potato salad", false, 3.29);
        addItem("Hot-dog", "A hot dog, with sauerkraut, relish, onions, topped with cheese", false, 3.05);
    }

    public void addItem(String name , String desc , boolean vegetarian, double price ){
        MenuItem item  = new MenuItem(name, desc, vegetarian, price);

        if (numberOffItems >= MAX_ITEMS) {
            System.err.println("Sorry, menu is full! Can't add item to menu");
        } else {
            menuItems[numberOffItems] = item;
            numberOffItems++;
        }

    }

    public Iterator getIterator(){
       return new DinerMenuIterator(menuItems);
    }


}


