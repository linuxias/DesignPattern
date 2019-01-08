package example.designpattern;

/**
 * Created by linuxias on 19. 1. 8.
 */
public class Whip extends BeverageDecorator {
    public Whip (Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 0.4 + this.beverage.cost();
    }
}
