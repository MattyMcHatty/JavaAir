import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    CabinCrewMember flightAttendant;

    @Before
    public void before(){
        flightAttendant = new CabinCrewMember("Darcie", RankType.FlightAttendant);
    }

    @Test
    public void canGetName(){
        assertEquals("Darcie", flightAttendant.getName());
    }

    @Test
    public void canSetName(){
        flightAttendant.setName("Juniper");
        assertEquals("Juniper", flightAttendant.getName());
    }

    @Test
    public void canGetRank(){
        assertEquals(RankType.FlightAttendant, flightAttendant.getRank());
    }

    @Test
    public void canSetRank(){
        flightAttendant.setRank(RankType.FirstOfficer);
        assertEquals(RankType.FirstOfficer, flightAttendant.getRank());

    }
}
