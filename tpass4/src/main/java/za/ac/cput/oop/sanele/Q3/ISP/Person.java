package za.ac.cput.oop.sanele.Q3.ISP;

/**
 * Created by NXA-C.unltd on 2016/03/27.
 */
public class Person implements IPerson{
    public String work(String jobDescr)
    {
        return jobDescr;
    }

    public String eat(String food)
    {
        return food;
    }

    public String sleep(String bedtime)
    {
        return bedtime;
    }
}
