package sanq.examole.templates.iterator;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: Sanq
 * Date: 24.03.14
 * Time: 11:03
 */
public class PancakeMenuIterator implements Iterator {
    ArrayList<MenuItem> items;
    int pos;

    public PancakeMenuIterator(ArrayList<MenuItem> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return  ((pos >= items.size()) || (items.get(pos) == null)) ? false : true;
    }

    @Override
    public Object next() {
        MenuItem item = items.get(pos);
        pos++;
        return item;
    }
}
