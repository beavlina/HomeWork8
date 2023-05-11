public class Main
{
    public static void main(String[] args)
    {
        Shape[] shapes = { new Circle(1.2),
                           new Quad(7.3),
                           new Triangle(5,1.8),
                           new Sphere(6),
                           new Cube(5.6),
                           new Tetrahedron(1.5) };

        for (Shape shape : shapes)
        {
            System.out.println(printName(shape));
            if (shape instanceof TwoDimensionalShape)
              {

                System.out.println("Area: " + ((TwoDimensionalShape) shape).getArea());

              } else if (shape instanceof ThreeDimensionalShape)
              {

                System.out.println("Surface Area: " + ((ThreeDimensionalShape)shape).getArea());

                System.out.println("Volume: " + ((ThreeDimensionalShape)shape).getVolume());

              }

        }
    }
    public static String printName (Shape shape)
    {
        return "This is a " + shape.getClass().getSimpleName();
    }
}