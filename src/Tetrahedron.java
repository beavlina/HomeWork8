public class Tetrahedron extends ThreeDimensionalShape
{   private double side;
    Tetrahedron(double side)
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
        System.out.println("The name of this shape is Tetrahedron");
    }

    @Override
    public double getArea()
    {
        return Math.sqrt(3) * side * side;
    }

    @Override
    public double getVolume()
    {
        return (Math.sqrt(2)/12) * side * side * side;
    }
}
