import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Pilot pilot;
    CabinCrewMember crew1;
    CabinCrewMember crew2;
    Passenger passenger1;
    Passenger passenger2;
    Plane plane;

    @Before
    public void before(){
        pilot = new Pilot("Peter Quill", RankType.Captain, "DEF456");
        crew1 = new CabinCrewMember("Gamora", RankType.FlightAttendant);
        crew2 = new CabinCrewMember("Drax", RankType.FirstOfficer);
        passenger1 = new Passenger("Thor Odinson", 1);
        passenger2 = new Passenger("Rocket Racoon", 2);
        plane = new Plane(PlaneType.TESTPLANE);
        flight = new Flight(pilot, plane, "TF420", "GAT", "GLA", "12:45");
    }

    @Test
    public void canGetPilot(){
        assertEquals(pilot, flight.getPilot());
    }

    @Test
    public void canGetPlane(){
        assertEquals(plane, flight.getPlane());
    }

    @Test
    public void canGetFlightNumber(){
        assertEquals("TF420", flight.getFlightNumber());
    }

    @Test
    public void canGetDestination(){
        assertEquals("GAT", flight.getDestination());
    }

    @Test
    public void canGetDepartFrom(){
        assertEquals("GLA", flight.getDepartFrom());
    }

    @Test
    public void canGetDepartureTime(){
        assertEquals("12:45", flight.getDepartureTime());
    }

    @Test
    public void canAssignCabinCrew(){
        flight.assignCrew(crew1);
        assertEquals(1, flight.getCabinCrewListLength());
    }

    @Test
    public void canReturnNumberOfAvailableSeats(){
        assertEquals(3, flight.getAvailableSeats());
    }

    @Test
    public void canBookPassengerIfSeatsAvailable(){
        flight.bookPassenger(passenger1);
        assertEquals(2, flight.getAvailableSeats());
        assertEquals(1, flight.getPassengerListLength());
    }

    @Test
    public void cannotBookPassengerIfNoSeatsAvailable(){
        flight.bookPassenger(passenger1);
        flight.bookPassenger(passenger1);
        flight.bookPassenger(passenger1);
        assertEquals(0, flight.getAvailableSeats());
        flight.bookPassenger((passenger2));
        assertEquals(0, flight.getAvailableSeats());
    }

    @Test
    public void pilotCanFlyThePlane(){
        assertEquals("This is your Captain, Peter Quill speaking. Fasten your seatbelts we are about to take off.", flight.pilotFlyPlane());
    }

    @Test
    public void cabinCrewMemberCanRelayAMessage(){
        flight.assignCrew(crew2);
        flight.assignCrew(crew1);
        assertEquals("This is your Flight Attendant Gamora. Please set your tray tables in an upright position", flight.cabinCrewMemberRelaysMessage("Gamora"));
    }

    @Test
    public void returnsAnErrorIfNotAValidCrewMember(){
        flight.assignCrew(crew2);
        flight.assignCrew(crew1);
        assertEquals("That is not a valid crew member", flight.cabinCrewMemberRelaysMessage("Mantis"));

    }

}
