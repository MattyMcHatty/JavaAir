import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    FlightManager flightManager;
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
        flight.assignCrew(crew1);
        flight.assignCrew(crew2);
        flightManager = new FlightManager();
    }

    @Test
    public void canCalculateHowMuchBaggageWeightShouldBeReservedForEachPassenger(){
        assertEquals(41.5, flightManager.calculateBagWeightPerPassenger(flight), 0.5);
    }

    @Test
    public void canCalculateHowMuchBaggageWeightIsBookedByPassengersOfAFlight(){
        flight.bookPassenger(passenger1);
        assertEquals(41.5, flightManager.calculateHowMuchBaggageWeightIsBooked(flight), 0.5);
        flight.bookPassenger(passenger2);
        assertEquals(124.5, flightManager.calculateHowMuchBaggageWeightIsBooked(flight), 0.5);
    }

    @Test
    public void canCalculateHowMuchBaggageWeightIsLeft(){
        flight.bookPassenger(passenger1);
        assertEquals(83.5, flightManager.calculateHowMuchBaggageWeightIsLeft(flight), 0.5);
    }

}
