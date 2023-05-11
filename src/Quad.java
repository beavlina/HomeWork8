public class Quad extends TwoDimensionalShape
{   private double side;
    Quad(double side)
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
        System.out.println("The name of this shape is Quad");
    }

    @Override
    public double getArea()
    {
        return side * side;
    }
}
