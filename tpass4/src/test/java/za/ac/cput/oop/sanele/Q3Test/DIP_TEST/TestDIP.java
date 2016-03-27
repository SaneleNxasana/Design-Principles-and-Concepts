package za.ac.cput.oop.sanele.Q3Test.DIP_TEST;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.oop.sanele.Q3.DIP.Admin;
import za.ac.cput.oop.sanele.Q3.DIP.Lecturer;
import za.ac.cput.oop.sanele.Q3.DIP.Student;

/**
 * Created by NXA-C.unltd on 2016/03/27.
 */
public class TestDIP {
    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testCorrect() throws Exception {
        Admin admin = new Admin();
        Student stud = new Student();

        Assert.assertSame("Study", stud.job());
    }

    @Test
    public void testViolate() throws Exception {
        Admin admin = new Admin();
        Lecturer lect = new Lecturer();

        Assert.assertSame("Pass knowledge to students", lect.job());
    }
}
