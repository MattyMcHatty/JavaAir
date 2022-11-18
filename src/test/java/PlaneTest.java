import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void before(){
        plane = new Plane(PlaneType.BOEING747);
    }

    @Test
    public void canGetPlaneType(){
        assertEquals(PlaneType.BOEING747, plane.getPlaneType());
    }

    @Test
    public void canSetPlaneType(){
        plane.setPlaneType(PlaneType.AIRBUS);
        assertEquals(PlaneType.AIRBUS, plane.getPlaneType());
    }

    @Test
    public void canGetPlaneCapacity(){
        assertEquals(100, plane.getPlaneCapacity());
    }

    @Test
    public void canGetPlaneWeightAllowance(){
        assertEquals(5000, plane.getPlaneWeightAllowance(), 0.01);
    }
}
