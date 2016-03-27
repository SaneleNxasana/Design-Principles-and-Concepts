package za.ac.cput.oop.sanele.Q3.SRP;

/**
 * Created by NXA-C.unltd on 2016/03/27.
 */
public class VioRectangle {
    private int length;
    private int width;

    public VioRectangle() {
    }

    public VioRectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int area(int lenth, int width) {
        return lenth * width;
    }

    @Override
    public String toString() {
        return "VioRectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
