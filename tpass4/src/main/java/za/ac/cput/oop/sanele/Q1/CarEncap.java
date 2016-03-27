package za.ac.cput.oop.sanele.Q1;

/**
 * Created by NXA-C.unltd on 2016/03/26.
 */
public class CarEncap
{
    private String model;
    private int year;
    private String type;

    public CarEncap()
    {}

    public CarEncap(String model, int year, String type) {
        this.model = model;
        this.year = year;
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Car - " +
                "Model = '" + model + '\'' + "," +
                " Year = " + year + "," +
                " Type = '" + type + '\'';
    }
}

