package za.ac.cput.oop.sanele.Q3.OCP;

/**
 * Created by NXA-C.unltd on 2016/03/27.
 */
public class VolumeCalculator {
    public double Volume(int shape){
        double volume = 0;

        VioCube cube = new VioCube();
        VioCylinder cylinder = new VioCylinder();

        cube.setSide(5);

        cylinder.setHeight(4);
        cylinder.setRad(6);

        if(shape == 1)
        {
            volume = cube.getSide() * cube.getSide() * cube.getSide();
        }
        else
        if(shape == 2)
        {
            volume = Math.PI * (cylinder.getRad()*cylinder.getRad()) * cylinder.getHeight();
        }
        return volume;
    }
}
