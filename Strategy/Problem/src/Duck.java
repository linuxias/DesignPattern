/**
 * Created by linuxias on 18. 12. 10.
 */
abstract public class Duck {
    public void fly() {
        System.out.println("fly");
    }

    public void quack() {
        System.out.println("quack");
    }

    abstract public void display();
}
