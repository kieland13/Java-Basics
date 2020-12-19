//asks the users to enter an integer
import java.util.Scanner;

public class NestedIf {

    public static void main(String[] args) {

        //creates a scanner variable
        Scanner scnr = new Scanner(System.in);

        //asks the users to enter an integer
        System.out.print("Enter an integer number: ");
        int number = scnr.nextInt();

        //if the number is greater than 10, print message
        if (number > 10) {

            System.out.println("The number you entered is greater than 10.");

        //if less than 5, print this message
        } else if (number < 5) {

            System.out.println("The number you entered is less than 5.");

        //if not greater than 10 and less than 5, print message
        } else {

            System.out.println("The number you entered is between 5 and 10.");

        }

        //print off the number user entered in
        System.out.println("The number you entered is: " + number);

    }

}