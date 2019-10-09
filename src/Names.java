

public class Names {
    public static void main(String[] args){


        String firstName = "Sergio";
        String lastName = "Kitchens";

        System.out.println(firstName + " " + lastName);

        System.out.println(firstName.length() + lastName.length());

        System.out.println(firstName.substring(0 , 1) +  lastName.substring(0, 1));

        System.out.println(firstName.compareTo(lastName));


        System.out.println(lastName.indexOf(firstName.substring(firstName.length() - 1)));

        int mid1 = (firstName.length()) / 2;
        int mid2 = (lastName.length()) / 2;
        System.out.println(mid1 + mid2);

        String FirstLast =  firstName.substring(0, mid1) + lastName.substring(mid2);
        String LastFirst =  lastName.substring(0, mid2) + firstName.substring(mid1);

        System.out.print(FirstLast + " ");
        System.out.print(LastFirst);



    }
}
