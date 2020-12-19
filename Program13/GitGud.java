//import so we can use the scanner for user input
import java.util.Scanner;

public class GitGud {

    public static void main(String[] args) {

        //creates a scanner variable
        Scanner scnr = new Scanner(System.in);

        //ask user to enter a user and reads the typed number
        System.out.print("Enter an integer number: ");
        int number = scnr.nextInt();

        //checks if number is divisible by 3 and 5
        if ((number % 3 == 0) && (number % 5 == 0)) {

            System.out.println("GitGud");

        //checks if number is divisible by only 3
        } else if (number % 3 == 0) {

            System.out.println("Git");

        //checks if number is divisible by only 5
        } else if (number % 5 == 0) {

            System.out.println("Gud");

        //if not divisible by 3 05 5, just print out the number
        } else {
            System.out.println(number);
        }
    }

}