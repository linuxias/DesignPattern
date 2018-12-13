package example.designpattern;

/**
 * Created by linuxias on 18. 12. 13.
 */
public class Tea {
    void prepareRecipe() {
        boilwater();
        steepTeaBag();
        pourInCup();
        addLemon();
    }

    public void boilwater() {
        System.out.println("Boiling water");
    }

    public void steepTeaBag() {
        System.out.println("Steeping the tea");
    }

    public void pourInCup() {
        System.out.println("Pouring into cup");
    }

    public void addLemon() {
        System.out.println("Adding Lemon");
    }
}
