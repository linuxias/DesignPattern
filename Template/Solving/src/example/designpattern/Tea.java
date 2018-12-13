package example.designpattern;

/**
 * Created by linuxias on 18. 12. 13.
 */
public class Tea extends CaffeineBeverage{
    @Override
    public void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding Lemon");
    }
}
