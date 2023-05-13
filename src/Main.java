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
            ShapePrinter shapePrinter = new ShapePrinter();
            shapePrinter.printName(shape);
        }
    }
  }