package za.ac.cput.oop.sanele.Q3.DIP;

/**
 * Created by NXA-C.unltd on 2016/03/27.
 */
public class Student implements IPerson {
    private String name;
    private String duty;

    public Student() {
    }

    public Student(String name, String duty) {
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
        duty = "Study";
        return duty;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", duty='" + duty + '\'' +
                '}';
    }
}
