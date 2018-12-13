package example.designpattern;

public class Main {

    public static void main(String[] args) {
	    /*
	     * @Solving
	     *  We removed duplicated code in Coffee and Tea class.
	     *  We encapsulate an dup codes by creating a template.
	     *  The template method is defined skeleton of an algorithm as a set of steps.
	     *  Some methods of the algorithm have to be implemented by the implemented by the subclasses
	     *
	     *  @Design Principle : Hollywood Principle
	     *  It prevents 'Dependency rot (high-level components depend on low-level components, and vice versa)'
	     *      high-level component <-> low-level components
	     *  High-level component controls low-level components.
	     *  Low-level components must don't call high-level, High-level components calls to low-level only.
	     *
	     */
    }
}
