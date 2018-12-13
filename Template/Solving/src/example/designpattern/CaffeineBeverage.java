package example.designpattern;

/**
 * Created by linuxias on 18. 12. 14.
 */
abstract public class CaffeineBeverage {
    final public void prepareRecipe() {
        boilwater();
        brew();
        pourInCup();
        addCondiments();
    }

    abstract public void brew();

    abstract public void addCondiments();

    public void boilwater() {
        System.out.println("Boiling water");
    }

    public void pourInCup() {
        System.out.println("Pouring into cup");
    }
}
