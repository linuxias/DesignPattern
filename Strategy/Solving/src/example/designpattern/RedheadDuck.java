package example.designpattern;

/**
 * Created by linuxias on 18. 12. 10.
 */
public class RedheadDuck extends Duck {

    public RedheadDuck() {
        qb = new Quack();
        fb = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("display RedheadDuck");
    }
}
