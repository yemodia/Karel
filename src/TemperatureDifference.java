import java.util.Scanner;

public class TemperatureDifference {
    public static void main(String[] args){
        Scanner temp = new Scanner(System.in);
        System.out.print("Enter the first temperature: ");
        double firstTemp = temp.nextDouble();

        System.out.print("Enter the second temperature: ");
        double secondTemp = temp.nextDouble();

        double tempDifference = secondTemp - firstTemp;

        double finalTemp = tempDifference;

        System.out.print("The temperature changed by " + finalTemp + " degrees");




    }
}
