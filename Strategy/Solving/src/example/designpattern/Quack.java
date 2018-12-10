package example.designpattern;

/**
 * Created by linuxias on 18. 12. 10.
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
