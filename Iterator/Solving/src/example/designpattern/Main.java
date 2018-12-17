package example.designpattern;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        PencakeHouseMenu pencakeHouseMenu = new PencakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
	    Waitress waitress = new Waitress(pencakeHouseMenu, dinerMenu);
	    waitress.printMenu();
    }
}
