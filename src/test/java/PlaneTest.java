import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void before(){
        plane = new Plane(PlaneType.AIRBUSA320);
    }

    @Test
    public void planeHasPlaneType() {
        assertEquals(PlaneType.AIRBUSA320, plane.getPlaneType());
    }

    @Test
    public void planeHasCapacity() {
        assertEquals(170, plane.getCapacity());
    }

    @Test
    public void planeHasWeight(){
        assertEquals(83000, plane.getWeight());
    }
}
