import java.util.ArrayList;

public class Flight {
    private Pilot pilot;
    private ArrayList<CabinCrewMember> cabinCrew;
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String departFrom;
    private String departureTime;

    public Flight(Pilot pilot, Plane plane, String flightNumber, String destination, String departFrom, String departureTime){
        this.pilot = pilot;
        this.cabinCrew = new ArrayList<CabinCrewMember>();
        this.passengers = new ArrayList<Passenger>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departFrom = departFrom;
        this.departureTime = departureTime;
    }

    public Pilot getPilot() {
        return pilot;
    }

    public void setPilot(Pilot pilot) {
        this.pilot = pilot;
    }

    public Plane getPlane() {
        return plane;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDepartFrom() {
        return departFrom;
    }

    public void setDepartFrom(String departFrom) {
        this.departFrom = departFrom;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public int getPassengerListLength() {
        return passengers.size();
    }

    public int getAvailableSeats(){
        return plane.getPlaneCapacity() - getPassengerListLength();
    }

    public void bookPassenger(Passenger passenger) {
        if(getAvailableSeats() > 0) {
            passengers.add(passenger);
        }
    }


    public String pilotFlyPlane() {
        return "This is your Captain, " + pilot.getName() + " speaking. Fasten your seatbelts we are about to take off.";
    }

    public String cabinCrewMemberRelaysMessage(String cabinCrewMembersName) {
        for (CabinCrewMember cabinCrewMember : this.cabinCrew) {
            if (cabinCrewMember.getName() == cabinCrewMembersName) {
                return "This is your Flight Attendant " + cabinCrewMember.getName() + ". Please set your tray tables in an upright position";
            }
        }
        return "That is not a valid crew member";
    }

    public void assignCrew(CabinCrewMember crew) {
        cabinCrew.add(crew);
    }

    public int getCabinCrewListLength() {
        return cabinCrew.size();
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }
}
