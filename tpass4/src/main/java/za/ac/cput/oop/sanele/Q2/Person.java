package za.ac.cput.oop.sanele.Q2;

/**
 * Created by NXA-C.unltd on 2016/03/26.
 */
public class Person
{
    private String idNum;
    private String name;
    private String surname;

    public Person()
    {}

    public Person(String idNum, String name, String surname) {
        this.idNum = idNum;
        this.name = name;
        this.surname = surname;
    }

    public String getIdNum() {
        return idNum;
    }

    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "idNum='" + idNum + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
