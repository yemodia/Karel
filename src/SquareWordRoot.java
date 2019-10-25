import java.util.Scanner;

public class SquareWordRoot {
     public static void main(String[] args){
         Scanner scan = new Scanner(System.in);

         System.out.print("Enter your word: ");
         String word = scan.nextLine();

         int indexOfWord = word.length();
         int wordSquared = (int)(Math.sqrt(indexOfWord));
         String letter = word.substring(wordSquared, wordSquared + 1);

         System.out.print("The \" square root \" of " + word + " is: " + letter);



     }
}
