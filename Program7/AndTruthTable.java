//import so we can use the scanner for user input
import java.util.Scanner;

public class AndTruthTable {

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
        //compare with true and false using and operator
        result = userInput && a;
        result1 = userInput && b;

        //take the results of the opposite of theentered boolean
        //compare with true and false using and operator
        oppositeResult = !userInput && a;
        oppositeResult1 =  !userInput && b;

        ///print off results
        System.out.println(userInput + " and true == " + result);
        System.out.println(userInput + " and false == " + result1);
        System.out.println(!userInput + " and true == " + oppositeResult);
        System.out.println(!userInput + " and false == " + oppositeResult1);
    }
}