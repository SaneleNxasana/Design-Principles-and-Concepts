package za.ac.cput.oop.sanele.Q3Test.OCP_Test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.oop.sanele.Q3.OCP.VioCube;
import za.ac.cput.oop.sanele.Q3.OCP.VioCylinder;
import za.ac.cput.oop.sanele.Q3.OCP.VolumeCalculator;

/**
 * Created by NXA-C.unltd on 2016/03/27.
 */
public class TestVioThreeDim {
    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testVolume() throws Exception {
        VioCube cube = new VioCube();
        VioCylinder cylinder = new VioCylinder();
        VolumeCalculator volC = new VolumeCalculator();

        Assert.assertEquals(volC.Volume(1), 125, 0.1);
        Assert.assertEquals(volC.Volume(2), 452.3893421169302, 0.2);
    }
}
