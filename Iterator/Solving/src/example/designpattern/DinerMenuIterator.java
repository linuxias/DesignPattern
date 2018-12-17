package example.designpattern;

/**
 * Created by linuxias on 18. 12. 17.
 */
public class DinerMenuIterator implements Iterator {
    private MenuItem[] menuItems;
    private int position = 0;

    public DinerMenuIterator(MenuItem[] items) {
        this.menuItems = items;
    }

    @Override
    public boolean hasNext() {
        if (position >= menuItems.length) return false;
        return true;
    }

    @Override
    public Object next() {
        MenuItem item = menuItems[position];
        position++;
        return item;
    }
}
