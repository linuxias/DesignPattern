package example.designpattern;

/**
 * Created by linuxias on 18. 12. 13.
 */
public class Coffee {
    void prepareRecipe() {
        boilwater();
        brewCoffeegrinds();
        pourInCup();
        addSugarAndMilk();
    }

    public void boilwater() {
        System.out.println("Boiling water");
    }

    public void brewCoffeegrinds() {
        System.out.println("Dripping example.designpattern.Coffee through filter");
    }

    public void pourInCup() {
        System.out.println("Pouring into cup");
    }

    public void addSugarAndMilk() {
        System.out.println("Adding Sugar and Milk");
    }
}
