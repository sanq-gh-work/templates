package sanq.example.templates.composite;

/**
 * Created with IntelliJ IDEA.
 * User: Sanq
 * Date: 25.03.14
 * Time: 10:05
 */
public abstract class MenuComponent {


    /* for manage sub-menu*/
    public void add (MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }
    public void remove (MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }
    public MenuComponent getChild(int i){
        throw new UnsupportedOperationException();
    }


    /* for menu item*/
    public String getName (){
        throw new UnsupportedOperationException();
    }
    public String getDescription (){
        throw new UnsupportedOperationException();
    }
    public double getPrice (){
        throw new UnsupportedOperationException();
    }
    public boolean isVegetarian (){
        throw new UnsupportedOperationException();
    }
    public void print (){
        throw new UnsupportedOperationException();
    }




}
