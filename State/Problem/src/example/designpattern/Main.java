package example.designpattern;

public class Main {

    public static void main(String[] args) {

    	/*
    	 * @Problem
    	 * If the state is add, you must add condition statement in each method
    	 */
	    GumballMachine gumballMachine = new GumballMachine(5);

	    gumballMachine.insertQuearter();
	    gumballMachine.turnsCrank();

	    gumballMachine.insertQuearter();
	    gumballMachine.ejectQuarter();
	    gumballMachine.turnsCrank();

    }
}
