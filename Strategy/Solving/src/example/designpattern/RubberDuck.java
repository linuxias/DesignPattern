package example.designpattern;

/**
 * Created by linuxias on 18. 12. 10.
 */
public class RubberDuck extends Duck {

    public RubberDuck() {
        qb = new Quack();
        fb = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("display rubberduck");
    }
}
