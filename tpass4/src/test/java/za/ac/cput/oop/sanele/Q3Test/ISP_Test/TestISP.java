package za.ac.cput.oop.sanele.Q3Test.ISP_Test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.oop.sanele.Q3.ISP.Person;
import za.ac.cput.oop.sanele.Q3.ISP.Robot;

/**
 * Created by NXA-C.unltd on 2016/03/27.
 */
public class TestISP {
    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testInter() throws Exception {
        Person person = new Person();
        Robot robot = new Robot();

        Assert.assertEquals(person.eat("Food"), "Food");
        Assert.assertEquals(robot.recharge("Battery Low"), "Battery Low");

    }
}
