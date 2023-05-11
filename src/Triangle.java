public class Triangle extends TwoDimensionalShape
{   private double base;
    private  double height;
    Triangle(double base, double height)
    {
        this.base = base;
        this.height = height;
    }

    public double getBase()
    {
        return base;
    }

    public double getHeight()
    {
        return height;
    }

    @Override
    public void printName()
    {
        System.out.println("The name of this shape is Triangle");
    }

    @Override
    public double getArea()
    {
        return 0.5 * base * height;
    }
}
