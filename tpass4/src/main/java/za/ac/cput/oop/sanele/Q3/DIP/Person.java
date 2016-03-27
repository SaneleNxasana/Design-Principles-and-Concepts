package za.ac.cput.oop.sanele.Q3.DIP;

/**
 * Created by NXA-C.unltd on 2016/03/27.
 */
public class Person {
    private String name;
    private String idNum;
    private int age;
    private String career;

    public Person() {
    }

    public Person(String name, String idNum, int age, String career) {
        this.name = name;
        this.idNum = idNum;
        this.age = age;
        this.career = career;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdNum() {
        return idNum;
    }

    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }
}
