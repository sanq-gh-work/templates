package sanq.examole.templates.iterator;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: Sanq
 * Date: 24.03.14
 * Time: 10:39
 */
public class PancakeHouseMenu implements Menu{
    ArrayList<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<MenuItem>();
        addItem("K&B's Pancake Breakfast", "Pancakes with scrambled eggs, and toast", true, 2.99) ;
        addItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage", false, 2.99);
        addItem("Blueberry Pancakes", "Pancakes made with fresh blueberries", true, 3.49);
        addItem("Waffles", "Waffles, with your choice of blueberries or strawberries", true, 3.59);
    }

    public void addItem(String name , String desc , boolean vegetarian, double price ){
          menuItems.add(new MenuItem(name, desc, vegetarian, price));
    }

    public Iterator getIterator(){
        return new PancakeMenuIterator(menuItems);
    }

}
