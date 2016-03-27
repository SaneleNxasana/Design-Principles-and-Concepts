package za.ac.cput.oop.sanele.Q3.OCP;

/**
 * Created by NXA-C.unltd on 2016/03/27.
 */
public class Cube extends Shapes{
    public double side;

    public Cube(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double Volume() {
        return side * side * side;
    }
}
