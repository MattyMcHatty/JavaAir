import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void before(){
        passenger = new Passenger("Steve Rogers", 2);
    }

    @Test
    public void canGetName(){
        assertEquals("Steve Rogers", passenger.getName());
    }

    @Test
    public void canSetName(){
        passenger.setName("Tony Stark");
        assertEquals("Tony Stark", passenger.getName());
    }

    @Test
    public void canGetBags(){
        assertEquals(2, passenger.getBags());
    }

    @Test
    public void canSetBags(){
        passenger.setBags(3);
        assertEquals(3, passenger.getBags());
    }



}
