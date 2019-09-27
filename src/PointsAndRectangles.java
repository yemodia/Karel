import java.awt.*;
import java.util.Scanner;

public class PointsAndRectangles {
    public static void main(String[] args){
        Scanner coordinates = new Scanner(System.in);

        System.out.print("Please enter a X coordinate:");
        int xCoordinate = coordinates.nextInt();

        System.out.print("PLease enter a Y coordinate:");
        int yCoordinate = coordinates.nextInt();

        System.out.print("Please enter a width: ");
        int width = coordinates.nextInt();

        System.out.print("Please enter a height: ");
        int height = coordinates.nextInt();

        Point point = new Point(xCoordinate, yCoordinate);
        Dimension dimension = new Dimension(width, height);
        Rectangle rectangle = new Rectangle(point, dimension);

        System.out.print(rectangle);
    }
}
