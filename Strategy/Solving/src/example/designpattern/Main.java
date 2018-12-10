package example.designpattern;

public class Main {
    public static void main(String[] args) {
        Duck rubber = new RubberDuck();
        rubber.fly();
        rubber.quack();
        rubber.display();
        rubber.setFlyBehavior(new FlyWithRocketPower());
        rubber.fly();
    }
}
