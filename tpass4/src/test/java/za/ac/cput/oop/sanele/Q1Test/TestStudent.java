package za.ac.cput.oop.sanele.Q1Test;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.oop.sanele.Q1.Person;
import za.ac.cput.oop.sanele.Q1.Student;

/**
 * Created by NXA-C.unltd on 2016/03/26.
 */
public class TestStudent
{
    @Before
    public void setUp() throws Exception
    {    }

    @Test
    public void testStudent() throws Exception
    {
        Person stud1 = new Student("9209080000001", "Bruce", "Wayne", "211275220", "ND:BS");
        Person stud2 = new Student("9209080000002", "Peter", "Parker", "201456852", "ND:PG");
        Person stud3 = new Student("9209080000003", "Clarke", "Kent", "205468159", "ND:OM");

        System.out.println(stud1.toString());
        System.out.println(stud2.toString());
        System.out.println(stud3.toString());

        Assert.assertNotSame(String.valueOf(stud1), stud2, stud3);
    }
}
