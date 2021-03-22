import java.util.ArrayList;

public class Flight {

    private ArrayList<Passenger> bookedPax;
    private PlaneType planeType;
    private String flightNumber;
    private String departureApt;
    private String destinationApt;
    private String departureTime;

    public Flight(PlaneType planeType, String flightNumber, String departureApt, String destinationApt, String departureTime) {
        this.planeType = planeType;
        this.flightNumber = flightNumber;
        this.departureApt = departureApt;
        this.destinationApt = destinationApt;
        this.departureTime = departureTime;
        this.bookedPax = new ArrayList<Passenger>();
    }

    public int getNumberOfBookedPax() {
        return this.bookedPax.size();
    }

    public void addPax(Passenger passenger) {
        this.bookedPax.add(passenger);
    }

    public PlaneType getPlaneType() {
        return planeType;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDepartureApt() {
        return departureApt;
    }

    public String getDestinationApt() {
        return destinationApt;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public int returnCapacity() {
        return planeType.getCapacity();
    }

    public void canAddPaxToFlight(Flight flight, ArrayList<Passenger> passengers) {


    }

}

