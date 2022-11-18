import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void before(){
        pilot = new Pilot("James Rhodes", RankType.Captain, "ABC123");
    }

    @Test
    public void canGetName(){
        assertEquals("James Rhodes", pilot.getName());
    }

    @Test
    public void canSetName(){
        pilot.setName("Carol Danvers");
        assertEquals("Carol Danvers", pilot.getName());
    }

    @Test
    public void canGetRank(){
        assertEquals(RankType.Captain, pilot.getRank());
    }

    @Test
    public void canSetRank(){
        pilot.setRank(RankType.FirstOfficer);
        assertEquals(RankType.FirstOfficer, pilot.getRank());
    }

    @Test
    public void canGetLicenceNumber(){
        assertEquals("ABC123", pilot.getLicenceNumber());
    }

    @Test
    public void canSetLicenceNumber(){
        pilot.setLicenceNumber("XYZ987");
        assertEquals("XYZ987", pilot.getLicenceNumber());
    }
}
