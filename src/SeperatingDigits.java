import java.util.Scanner;

public class SeperatingDigits {

private static int intQuotient (int numA) {

    int intQuotientRemainder = numA / 10;
    return intQuotientRemainder;

    }
private static int intRemainder (int numA){
    int numRemainder = numA % 10;
    return numRemainder;
}


    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a four digit whole number: ");
    int num = scan.nextInt();
    int remOne = intQuotient(num);
    int lastNum = intRemainder(num);

    int thirdNum = intRemainder(remOne);

    int secondRem = intQuotient(remOne);
    int secondNum = intRemainder(secondRem);

    int firstNum = intQuotient(secondRem);
   // int



    System.out.print(firstNum + " ");
    System.out.print(secondNum + " ");
    System.out.print(thirdNum + " ");
    System.out.print(lastNum);

    }
}
