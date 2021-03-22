import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void before(){
        passenger = new Passenger("Hannah", 2);
    }

    @Test
    public void passengerHasName(){
        assertEquals("Hannah", passenger.getName());
    }

    @Test
    public void passengerHasBags() {
        assertEquals(2, passenger.getNumberOfbags());
    }
}
