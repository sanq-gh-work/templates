package sanq.examole.templates.iterator;

/**
 * Created with IntelliJ IDEA.
 * User: Sanq
 * Date: 24.03.14
 * Time: 11:03
 */
public class DinerMenuIterator implements Iterator{
    MenuItem[] items;
    int pos;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if ((pos>= items.length) || items[pos] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        MenuItem item = items[pos];
        pos++;
        return item;
    }
}
