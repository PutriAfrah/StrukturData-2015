public class Vector3D {

    double x,y,z;

    private double x()
    {
        return x;
    } 

    private double y()
    {
        return y;
    }

    private double z()
    {
        return z;
    }

    public Vector3D (double x, double y, double z) {
        this.x=x;
        this.y=y;
        this.z=z;

    }
    public double getX () {
        return x;
    }
    
    public double getY () {
        return y;
    }
    
    public double getZ () {
        return z;
    }
}
