package za.ac.cput.oop.sanele.Q3.DIP;

/**
 * Created by NXA-C.unltd on 2016/03/27.
 */
public class Admin {
    IPerson person;

    public void setPerson(IPerson person) {
        this.person = person;
    }
    public void admin()
    {
        person.job();
    }
}
