import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * FIRST, COMPLETE Shape interface
 * THEN, COMPLETE Rectangle, Square, and Circle classes
 * LASTLY, COMPLETE TestShapes class
 */

public class TestShapes {
    public static <ArraysList> void main(String[] args) {

        double width = ScannerHelper.getDouble(Questions.widthOfRectangle);
        double height = ScannerHelper.getDouble(Questions.heightOfRectangle);
        double side = ScannerHelper.getDouble(Questions.sideOfSquare);
        double radius = ScannerHelper.getDouble(Questions.radiusOfCircle);

        Circle c = new Circle(radius);
        Rectangle r = new Rectangle(width, height);
        Square s = new Square(side);

        ArrayList<Shape> shapes = new ArrayList<>(Arrays.asList(c, r, s));

        System.out.println(c);
        System.out.println();
        System.out.println(r);
        System.out.println();
        System.out.println(s);
        System.out.println();

        System.out.println(largestArea(c, r, s).getClass().getSimpleName() + " has the largest area as " + largestArea(c, r, s).area());


        /*
        This will be our actual program that we request some information from user to create 3 objects
        We will create 1 Rectangle, 1 Square and 1 Circle object

        Information to create objects will be as below
         -width of the rectangle = 5.5
         -height of the rectangle = 6
         -side of the square = 2.5
         -radius of the circle = 4


         Then print each object
         And print area and perimeters of each object
         Find and print the object which has the largest area

         EXPECTED OUTPUT:
         Circle{radius=4.0}
         Area of the Circle is = 50.24
         Perimeter of the Circle is = 25.12

         Rectangle{width=5.5, height=6.0}
         Area of the Rectangle is = 33.0
         Perimeter of the Rectangle is = 23.0

         Square{side=2.5}
         Area of the Square is = 6.25
         Perimeter of the Square is = 10.0

         Circle has the largest area as 50.24
         */


    }
    public static Shape largestArea(Circle c, Rectangle r, Square s){
        if(c.area() > r.area() && c.area() > s.area()) return c;
        else if (r.area() > c.area() && r.area() > s.area()) return r;
        return s;
    }
}
