import java.awt.*;
import java.util.Scanner;

public class RectangleFun {
    public static void main(String[] args){
        Scanner user = new Scanner(System.in);

        System.out.print("Width: ");
        int width = user.nextInt();

        System.out.print("Height: ");
        int height = user.nextInt();

        System.out.print("X Coordinate: ");
        int xCoordinate = user.nextInt();

        System.out.print("Y Coordinate: ");
        int yCoordinate = user.nextInt();


        Rectangle rectangle = new Rectangle(xCoordinate, yCoordinate, width, height);

        double perimeter = (rectangle.getWidth() + rectangle.getHeight()) * 2 ;
        System.out.println("Perimeter:" + perimeter);

        int newX = xCoordinate - 4;
        int newY =  yCoordinate + 2 ;
        rectangle.setLocation(newX, newY);
        System.out.println("New Location: " + (rectangle.x) + "," + rectangle.y);




    }
}
