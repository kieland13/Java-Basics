//import so we can use the scanner for user input
import java.util.Scanner;

public class ExclusiveOrTruthTable {

    public static void main(String[] args) {

        //creates a scanner variable
        Scanner scnr = new Scanner(System.in);

        //create variables for the booleans
        boolean a = true;
        boolean b = false;
        boolean result;
        boolean result1;

        //ask the user to enter a boolean
        System.out.print("Enter a boolean (true or false):");

        //reads the boolean user entered
        boolean userInput = scnr.nextBoolean();

        //take the results of the entered boolean
        //compare with true and false using exclusive and operator
        result = userInput ^ a;
        result1 = userInput ^ b;

        //prints the results
        System.out.println(userInput + " xor true==" + result);
        System.out.println(userInput + " xor false==" + result1);
        System.out.println(!userInput + " xor true==" + !result);
        System.out.println(!userInput + " xor false==" + !result1);
    }
}