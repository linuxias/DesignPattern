package example.designpattern;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	/*
	 * @Problem
	 * 1. This project is coded to the concreate implementations, not to an interface
	 * 2. If the data structure that DinerMenu used changes from Array to HashTable,
	 *    we'd have to modify a lot of code because of Changes to the DinerMenu class directly affect the client.
	 * 3. The printer module what print menu list needs to know hoiw each menu
	 *    represents its internal collection of menu items.
	 * 4. There are duplicated code (ex. print menu)
	 */

	    PencakeHouseMenu pancakeHouseMenu = new PencakeHouseMenu();
	    ArrayList breakfastItems = pancakeHouseMenu.getMenuItems();
	    DinerMenu dinerMenu = new DinerMenu();
	    MenuItem[] lunchItems = dinerMenu.getMenuItems();

	    for (int i = 0 ; i < breakfastItems.size(); i++) {
	        MenuItem menuItem = (MenuItem)breakfastItems.get(i);
	        System.out.print(menuItem.getName() + " ");
            System.out.println(menuItem.getPrice() + " ");
            System.out.println(menuItem.getDescription() + " ");
        }

        for (int i = 0 ; i < dinerMenu.size(); i++) {
            MenuItem menuItem = lunchItems[i];
            System.out.print(menuItem.getName() + " ");
            System.out.println(menuItem.getPrice() + " ");
            System.out.println(menuItem.getDescription() + " ");
        }
    }
}
