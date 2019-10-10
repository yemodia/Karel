import java.util.Scanner;

public class TheNameGame {
    private static void lyrics(String name){

        System.out.println(name + " " + name + ", bo-B" + name.substring(1));
        System.out.println("Banana-fana fo-F" + name.substring(1));
        System.out.println("Fee-fi-mo-M" + name.substring(1));
        System.out.println(name + "");





    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("What is your first name?");
        String firstName = scan.nextLine();
        System.out.print("What is your last name?");
        String lastName = scan.nextLine();

        lyrics(firstName);
        lyrics(lastName);


    }
}
