//import so we can use the scanner for user input
import java.util.Scanner;

public class NotTruthTable {

    public static void main(String[] args) {

        //creates a scanner variable
        Scanner scnr = new Scanner(System.in);

        //asks the user to enter a boolean
        System.out.print("Enter a boolean: ");

        //read the boolean the user entered
        boolean userInput = scnr.nextBoolean();

        //take the opposite of the boolean they entered
        boolean result = !userInput;

        //print off the original and the opposite boolean
        System.out.println("You entered " + userInput + ", !" + userInput + " == " + result);
    }
}