package za.ac.cput.oop.sanele.Q3.DIP;

/**
 * Created by NXA-C.unltd on 2016/03/27.
 */
public class Lecturer implements IPerson{
    private String name;
    private String duty;

    public Lecturer()
    {}

    public Lecturer(String name, String duty) {
        this.name = name;
        this.duty = duty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }
    public String job()
    {
        duty = "Pass knowledge to students";
        return duty;
    }

    @Override
    public String toString() {
        return "Lecturer{" +
                "name='" + name + '\'' +
                ", duty='" + duty + '\'' +
                '}';
    }
}
