public class Circle extends TwoDimensionalShape
{  private double radius;
    Circle(double radius)
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
        System.out.println("The name of this shape is Circle");
    }

    @Override
    public double getArea()
    {
        return Math.PI * radius * radius;
    }
}
