//import so we can use the scanner for user input
import java.util.Scanner;

public class IfStatements {

    public static void main(String[] args) {

        //creates a scanner variable
        Scanner scnr = new Scanner(System.in);

        //asks the users to enter an integer
        System.out.print("Enter an integer number: ");
        int number = scnr.nextInt();

        //checks to see if the number is greater than 10
        //and prints off message
        if (number > 10) {
            System.out.println("The number you entered is greater than 10.");
        }

        //checks to see if the number is less than 5
        //and prints off message
        if (number < 5) {
            System.out.println("The number you entered is less than 5.");
        }
        
        //print off message of what number they typed in
        System.out.println("The number you entered is " + number);

    }

}