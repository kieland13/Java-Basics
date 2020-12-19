//import so we can use the scanner for user input
import java.util.Scanner;

public class OrTruthTable {

    public static void main(String[] args) {

        //creates a scanner variable
        Scanner scnr = new Scanner(System.in);

        //create variables for the booleans
        boolean a = true;
        boolean b = false;
        boolean result;
        boolean result1;
        boolean oppositeResult;
        boolean oppositeResult1;

        //ask the user to enter a boolean
        System.out.print("Enter a boolean: ");

        //reads the boolean user entered
        boolean userInput = scnr.nextBoolean();

        //take the results of the entered boolean
        //compare with true and false using or operator
        result = userInput || a;
        result1 = userInput || b;

        //take the results of the opposite of the entered boolean
        //compare with true and false using or operator
        oppositeResult = !userInput || a;
        oppositeResult1 =  !userInput || b;

        ///print off results
        System.out.println(userInput + " or true == " + result);
        System.out.println(userInput + " or false == " + result1);
        System.out.println(!userInput + " or true == " + oppositeResult);
        System.out.println(!userInput + " or false == " + oppositeResult1);
    }
}