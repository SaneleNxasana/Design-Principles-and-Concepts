package za.ac.cput.oop.sanele.Q3.ISP;

/**
 * Created by NXA-C.unltd on 2016/03/27.
 */
public class VioRobot implements IViolate{
    public String work(String jobDescr)
    {
        return jobDescr;
    }

    public String recharge(String battryLow)
    {
        return battryLow;
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
