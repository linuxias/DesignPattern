package example.designpattern;

/**
 * Created by linuxias on 18. 12. 10.
 */
abstract public class Duck {
    FlyBehavior fb;
    QuackBehavior qb;

    abstract public void display();

    public void fly() {
        fb.fly();
    }

    public void quack() {
        qb.quack();
    }

    // Change behavior dynamically
    public void setFlyBehavior(FlyBehavior fb) {
        this.fb = fb;
    }

    // Change behavior dynamically
    public void setQuackBehavior(QuackBehavior qb) {
        this.qb = qb;
    }

    public void swim() {
        System.out.println("All ducks swim!");
    }
}
