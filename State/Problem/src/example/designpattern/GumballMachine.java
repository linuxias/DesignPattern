package example.designpattern;

/**
 * Created by linuxias on 18. 12. 18.
 */
public class GumballMachine {
    final static int SOLD_OUT = 0;
    final static int NO_QUARTER = 1;
    final static int HAS_QUARTER = 2;
    final static int SOLD = 3;

    int state = SOLD_OUT;
    int count = 0;

    public GumballMachine(int count) {
        this.count = count;
        if (count > 0) state = NO_QUARTER;
    }

    public void insertQuearter() {
        if (state == HAS_QUARTER) {
            System.out.println("You can't insert another quarter");
        } else if (state == SOLD_OUT) {
            System.out.println("You can't insert quater");
        } else if (state == SOLD) {
            System.out.println("Please wait, already giving you a gumball");
        } else if (state == NO_QUARTER) {
            state = HAS_QUARTER;
        }
    }

    public void ejectQuarter() {
        // Do somthing
    }

    public void turnsCrank() {
        // Do something
    }

    public void dispenseGumball() {
        // Do something
    }
}
