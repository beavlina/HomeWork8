public class Cube extends ThreeDimensionalShape
{   private double side;

    Cube(double side)
    {
        this.side = side;
    }

    public double getSide()
    {
        return side;
    }

    @Override
    public void printName()
    {
        System.out.println("The name of this shape is Cube");
    }

    @Override
    public double getArea()
    {
        return  6 * side * side;
    }

    @Override
    public double getVolume()
    {
        return side * side * side;
    }
}
