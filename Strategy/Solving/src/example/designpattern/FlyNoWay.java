package example.designpattern;

/**
 * Created by linuxias on 18. 12. 10.
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("fly no way");
    }
}
