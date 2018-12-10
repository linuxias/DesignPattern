/**
 * Created by linuxias on 18. 12. 10.
 */
public class Main {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.fly();
        duck.display();

        duck = new RedheadDuck();
        duck.fly();
        duck.display();

        duck = new RubberDuck();
        duck.fly();
        duck.display();
    }
}
