package za.ac.cput.oop.sanele.Q3.OCP;

/**
 * Created by NXA-C.unltd on 2016/03/27.
 */
public class Cylinder extends Shapes {
    public double rad;
    public double height;

    public Cylinder(double rad, double height) {
        this.rad = rad;
        this.height = height;
    }

    public double getRad() {
        return rad;
    }

    public void setRad(double rad) {
        this.rad = rad;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double Volume() {
        return Math.PI * (rad*rad) * height;
    }
}
