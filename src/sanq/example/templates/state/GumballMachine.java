package sanq.example.templates.state;

import com.sun.corba.se.spi.activation._LocatorImplBase;

/**
 * Created with IntelliJ IDEA.
 * User: Sanq
 * Date: 25.03.14
 * Time: 12:15
 */
public class GumballMachine {
    private State soldOutState;
    private State noQuarterState;
    private State hasQuarterState;
    private State soldState;
    private State winnerState;

    //current state
    private State state = soldOutState;

    //gumball count
    int count = 0;

    // for proxy template
    String location;

    public GumballMachine(String location, int numberGumballs) {
        this.count = numberGumballs;
        this.location = location;

        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);
        if (count > 0) {
            state = noQuarterState;
        }

    }

    // machine actions
    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.tumCrank();
        state.dispense();
    }


    protected void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (count != 0) {
            count--;
        }
    }


    // getters & setters


    public int getCount() {
        return count;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "GumballMachine{" +
                "state=" + state.getClass().getSimpleName() +
                ", count=" + count +
                '}';
    }
}
