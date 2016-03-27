package za.ac.cput.oop.sanele.Q3Test.OCP_Test;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.oop.sanele.Q3.OCP.Cube;
import za.ac.cput.oop.sanele.Q3.OCP.Cylinder;

/**
 * Created by NXA-C.unltd on 2016/03/27.
 */
public class TestThreeDim {
    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testVolume() throws Exception {
        Cylinder vol1 = new Cylinder(5, 6);
        Cube vol2 = new Cube(9);

        System.out.println("Volume cylinder: "+vol1.Volume());
        System.out.println("Volume cube: "+vol2.Volume());

        Assert.assertNotSame(vol1,vol2);
    }
}
