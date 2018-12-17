package example.designpattern;

/**
 * Created by linuxias on 18. 12. 17.
 */
public class Waitress {
    MenuInterface pencakeHouseMenu;
    MenuInterface dinerMenu;

    public Waitress(MenuInterface pencakeHouseMenu, MenuInterface dinerMenu) {
        this.pencakeHouseMenu = pencakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu() {
        Iterator pencakeIterator = pencakeHouseMenu.createIterator();
        Iterator dinerIterator = dinerMenu.createIterator();

        printMenu(pencakeIterator);
        printMenu(dinerIterator);
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.print(menuItem.getName() + " ");
            System.out.println(menuItem.getPrice() + " ");
            System.out.println(menuItem.getDescription() + " ");
        }
    }
}
