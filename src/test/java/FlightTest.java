import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    private Flight flight;
    private Passenger passenger1;
    private Passenger passenger2;
    private Passenger passenger3;

    @Before
    public void before(){
        flight = new Flight(PlaneType.BOEING747, "TOM85", "FAO", "GLA", "0620");
        passenger1 = new Passenger("Tom", 3);
        passenger2 = new Passenger("Hannah", 1);
        passenger3 = new Passenger("Alice", 2);
    }

    @Test
    public void flightHasPlane(){
        assertEquals(PlaneType.BOEING747, flight.getPlaneType());
    }

    @Test
    public void flightHasFlightNumber(){
        assertEquals("TOM85", flight.getFlightNumber());
    }

    @Test
    public void flightHasDepartureApt(){
        assertEquals("FAO", flight.getDepartureApt());
    }

    @Test
    public void flightHasDestinationApt(){
        assertEquals("GLA", flight.getDestinationApt());
    }

    @Test
    public void flightHasDepartureTime(){
        assertEquals("0620", flight.getDepartureTime());
    }

    @Test
    public void returnCapacity() {
        assertEquals(539, flight.returnCapacity());
    }


    @Test
    public void returnNumberOfBookedPax() {
        assertEquals(0, flight.getNumberOfBookedPax() );
    }

    @Test
    public void canAddPaxToFlight() {
        ArrayList<Passenger> bookedPax = new ArrayList<Passenger>();
        flight.addPax(passenger1);
        flight.addPax(passenger2);
        flight.addPax(passenger3);
        assertEquals(3, flight.getNumberOfBookedPax());
    }

    @Test
    public void canAddPaxToFlight() {
        ArrayList<Passenger> passengers = new ArrayList<>();
        passengers.add(passenger1);
        flight.
    }
}