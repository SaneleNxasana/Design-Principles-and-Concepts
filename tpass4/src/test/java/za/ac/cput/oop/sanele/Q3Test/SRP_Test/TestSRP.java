package za.ac.cput.oop.sanele.Q3Test.SRP_Test;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.oop.sanele.Q3.SRP.RectImpl;
import za.ac.cput.oop.sanele.Q3.SRP.VioRectImpl;

/**
 * Created by NXA-C.unltd on 2016/03/27.
 */
public class TestSRP {
    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testCorrect() throws Exception {
        RectImpl rImp = new RectImpl();

        Assert.assertEquals(40, rImp.area(5, 8), 0.5);
    }

    @Test
    public void testViolate() throws Exception {
        VioRectImpl vrImp = new VioRectImpl();

        Assert.assertEquals(36, vrImp.area(4, 9), 0.5);
    }
}
