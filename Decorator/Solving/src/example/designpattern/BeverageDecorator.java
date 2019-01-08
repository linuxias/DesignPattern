package example.designpattern;

/**
 * Created by linuxias on 19. 1. 8.
 */
abstract public class BeverageDecorator extends Beverage {
    Beverage beverage;
    abstract public double cost();
}
