package example.designpattern;

/**
 * Created by linuxias on 18. 12. 17.
 */
public class DinerMenu {
    static final int MAX_ITEMS = 6;
    private int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("Vegetarian BLT", "Bacon with lettuce & tomato on whole wheat", true, 2.99);
        addItem("Soup of the Day", "Soup of the Day with potato salad", false, 3.29);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS)
            System.err.println("Sorry menu is full! Can't add any more items");
        else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems++;
        }
    }

    public MenuItem[] getMenuItems() {
        return menuItems;
    }

    public int size() {
        return numberOfItems;
    }
}
