package example.designpattern;

public class Main {

    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();

        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        turkey.gobble();
        turkeyAdapter.quack();
        duck.quack();
    }
}
