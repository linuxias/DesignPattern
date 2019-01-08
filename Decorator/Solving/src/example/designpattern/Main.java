package example.designpattern;

public class Main {

    public static void main(String[] args) {
        Beverage caffeMocha = new CaffeMocha();
        caffeMocha = new Milk(caffeMocha);
        caffeMocha = new Milk(caffeMocha);

        System.out.println("cost : " + caffeMocha.cost());
    }
}
