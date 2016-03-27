package za.ac.cput.oop.sanele.Q1Test;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.oop.sanele.Q1.CarEncap;

/**
 * Created by NXA-C.unltd on 2016/03/26.
 */
public class TestCarEncap
{
    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testCar() throws Exception {
        CarEncap car1 = new CarEncap("C63", 2015, "Sedan");
        CarEncap car2 = new CarEncap("M4", 2014, "Coupe");
        CarEncap car3 = new CarEncap("RS5", 2016, "Coupe");

        System.out.println(car1.toString());
        System.out.println(car2.toString());
        System.out.println(car3.toString());

        Assert.assertNotSame(String.valueOf(car1), car2, car3);
    }
}
