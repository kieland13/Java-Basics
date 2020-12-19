//import so we can use the scanner for user input
import java.util.Scanner;

public class TwoWayIfElse {

    public static void main(String[] args) {

        //creates a scanner variable
        Scanner scnr = new Scanner(System.in);

        //asks the users to enter an integer
        System.out.print("Enter an integer number: ");
        int number = scnr.nextInt();

        //checks to see if the number is greater than 10
        //and prints message
        if (number > 10) {

            System.out.println("The number you entered is greater than 10.");

        //if number is not greater than 10
        //print this message
        } else {

            System.out.println("The number you entered is less than or equal to 10.");

        }

        //if number is less than 5, print this message
        if (number < 5) {

            System.out.println("The number you entered is less than 5.");

        //if message is not less than 5, print this message
        } else {

            System.out.println("The number you entered is greater than or equal to 5.");

        }
        
        //print off the number the user typed in
        System.out.println("The number you entered is: " + number);

    }

}