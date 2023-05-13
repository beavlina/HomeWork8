public class Sphere extends ThreeDimensionalShape
{   private double radius;
    Sphere(double radius)
    {
        this.radius = radius;
    }

    public double getRadius()
    {
        return radius;
    }

    @Override
    public void printName()
    {
        System.out.println("The name of this shape is Sphere");
    }

    @Override
    public double getArea()
    {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    public double getVolume()
    {
        return  (4.0/3.0) * Math.PI * radius * radius * radius;
    }
}
