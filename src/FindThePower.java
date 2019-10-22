import java.util.Scanner;

public class FindThePower {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the base: " );
        double base = scan.nextDouble();

        System.out.println("Enter the exponent");
        double exponent = scan.nextDouble();

        System.out.println(base + " ^ " + exponent + " = " + Math.pow(base, exponent));



    }

}
