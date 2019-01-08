package example.designpattern;

/**
 * Created by linuxias on 19. 1. 8.
 */
public class Milk extends BeverageDecorator {
    public Milk (Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 0.3 + this.beverage.cost();
    }
}
