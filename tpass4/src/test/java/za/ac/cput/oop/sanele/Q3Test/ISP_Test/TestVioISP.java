package za.ac.cput.oop.sanele.Q3Test.ISP_Test;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.oop.sanele.Q3.ISP.VioPerson;
import za.ac.cput.oop.sanele.Q3.ISP.VioRobot;

/**
 * Created by NXA-C.unltd on 2016/03/27.
 */
public class TestVioISP {
    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testInter() throws Exception {
        VioPerson person = new VioPerson();
        VioRobot robot = new VioRobot();

        Assert.assertEquals(person.work("Work"), "Work");
        Assert.assertEquals(robot.work("Work"), "Work");
    }
}
