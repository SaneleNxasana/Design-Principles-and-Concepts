package za.ac.cput.oop.sanele.Q1;

/**
 * Created by NXA-C.unltd on 2016/03/26.
 */
public class Student extends Person
{
    private String studNum;
    private String course;

    public Student()
    {}

    public Student(String idNum, String name, String surname, String studNum, String course) {
        super(idNum, name, surname);
        this.studNum = studNum;
        this.course = course;
    }

    public String getStudNum() {
        return studNum;
    }

    public void setStudNum(String studNum) {
        this.studNum = studNum;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studNum='" + studNum + '\'' +
                ", course='" + course + '\'' +
                '}' +super.toString();
    }
}
