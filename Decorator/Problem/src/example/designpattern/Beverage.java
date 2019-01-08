package example.designpattern;

/**
 * Created by linuxias on 19. 1. 7.
 */
public class Beverage {
    protected String description;
    private boolean milk;
    private boolean soy;
    private boolean mocha;
    private boolean whip;

    public float cost() {
        float condimentCost = 0.0;
        if (hasMilk())
            condimentCost += milkCost;
        if (hasSoy())
            condimentCost += soyCost;
        if (hasMocha())
            condimentCost += mochaCost;
        if (hasWhip())
            condimentCost += whipCost;

        return condimentCost;
    }

    private boolean hasWhip() {
        return whip;
    }

    private boolean hasMocha() {
        return mocha;
    }

    private boolean hasSoy() {
        return soy;
    }

    private boolean hasMilk() {
        return milk;
    }

    public void setMilk(boolean milk) {
        this.milk = milk;
    }

    public void setSoy(boolean soy) {
        this.soy = soy;
    }

    public void setMocha(boolean mocha) {
        this.mocha = mocha;
    }

    public void setWhip(boolean whip) {
        this.whip = whip;
    }
}
