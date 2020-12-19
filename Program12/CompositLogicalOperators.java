//import so we can use the scanner for user input
import java.util.Scanner;

public class CompositLogicalOperators {

    public static void main(String[] args) {

        //creates a scanner variable
        Scanner scnr = new Scanner(System.in);

        //ask user to enter a user and reads the typed number
        System.out.print("Enter an integer number: ");
        double number = scnr.nextDouble();

        //checks if number is odd and greater than 100 or even and less than 100
        if (((number % 2 == 1) && (number > 100)) || ((number % 2 == 0) && (number < 100))) {
            System.out.println("(the number is odd and greater than 100) or (the number is even and less than 100)");
        }

        //checks if number is 42
        if (number != 42){
            System.out.println("You do not have the answer");
        }

        //checks if number is greater than 100, odd and less than 50 and greater than 15
        if (((number > 100)) || ((number % 2 == 1) && (number < 50) && (number > 15))) {
            System.out.println("(the number is greater than 100) or (less than 50 and not even and greater than 15)");
        }

    }
}