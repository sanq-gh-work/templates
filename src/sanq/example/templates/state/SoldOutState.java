package sanq.example.templates.state;

/**
 * Created with IntelliJ IDEA.
 * User: Sanq
 * Date: 25.03.14
 * Time: 12:50
 */

// todo implement it
public class SoldOutState implements State {
    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Gumballs are finished... ");
        gumballMachine.ejectQuarter();
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Gumballs are finished... ");
    }

    @Override
    public void tumCrank() {
        System.out.println("Gumballs are finished... ");
    }

    @Override
    public void dispense() {
        System.out.println("Gumballs are finished... ");
    }
}
