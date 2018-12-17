package example.designpattern;

import java.util.ArrayList;

/**
 * Created by linuxias on 18. 12. 17.
 */
public class PencakeHouseMenuIterator implements Iterator {
    ArrayList menuList;
    private int position = 0;

    public PencakeHouseMenuIterator(ArrayList menuList) {
        this.menuList = menuList;
    }

    @Override
    public boolean hasNext() {
        if (position >= menuList.size()) return false;
        return true;
    }

    @Override
    public Object next() {
        MenuItem item = (MenuItem) menuList.get(position);
        position++;
        return item;
    }
}
