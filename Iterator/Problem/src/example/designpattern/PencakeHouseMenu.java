package example.designpattern;

import java.util.ArrayList;

/**
 * Created by linuxias on 18. 12. 17.
 */
public class PencakeHouseMenu {
    ArrayList menuItems;

    public PencakeHouseMenu() {
        menuItems = new ArrayList();
        addItem("Rehular Pancake Breakfast", "Pancake with fried eggs, sausage", false, 2.99);
        addItem("Blueberry pancakes", "Pancakes made with fresh blueberries", true, 3.49);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    public ArrayList getMenuItems() {
        return menuItems;
    }
}
