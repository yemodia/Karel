import java.util.Scanner;

public class Password {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("First Name: ");
        String firstName = scan.nextLine();

        System.out.print("Middle Name: ");
        String middleName = scan.nextLine();

        System.out.print("Last Name: ");
        String lastName = scan.nextLine();

        System.out.print("Age: ");
        int age = scan.nextInt();

        String firstLetter = firstName.substring(firstName.length() / 2);
        String middleLetter = middleName.substring(middleName.length() / 2);
        String lastLetter = lastName.substring(lastName.length() / 2);

        String lastFirst = firstName.substring(firstName.length()-1);
        String lastMiddle = middleName.substring(middleName.length() -1);
        String lastLast = lastName.substring(lastName.length() - 1);

        firstLetter =  firstLetter.toUpperCase();
        middleLetter = middleLetter.toUpperCase();
        lastLetter = lastLetter.toUpperCase();

        lastFirst = lastFirst.toLowerCase();
        lastMiddle = lastMiddle.toLowerCase();
        lastLast = lastLast.toLowerCase();

        String password = firstLetter + middleLetter + lastLetter+ lastFirst + lastMiddle + lastLast +  (75 * age);

        System.out.print(password);
    }
}
