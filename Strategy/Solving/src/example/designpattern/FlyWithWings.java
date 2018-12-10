package example.designpattern;

/**
 * Created by linuxias on 18. 12. 10.
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("fly with wings");
    }
}
