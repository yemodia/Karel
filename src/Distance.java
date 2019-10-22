import java.util.Scanner;

public class Distance {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first X coordinate");
        double firstX = scan.nextDouble();

        System.out.println("Enter the first Y coordinate");
        double firstY = scan.nextDouble();

        System.out.println("Enter second X coordinate:");
        double secondX = scan.nextDouble();
        System.out.println("Enter the second Y coordinate: ");
        double secondY = scan.nextDouble();
        double differenceX =secondX - firstX;
        double differenceY = secondY - firstY;

        double xSquared = Math.pow(differenceX, 2);

        double ySquared = Math.pow(differenceY, 2);

        double distance = xSquared + ySquared;

        System.out.print("The distance is: " + distance );
    }
}
