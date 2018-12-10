package example.designpattern;

/**
 * Created by linuxias on 18. 12. 10.
 */
public class FlyWithRocketPower implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Fly with rocket power");
    }
}
