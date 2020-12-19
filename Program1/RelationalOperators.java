//import so we can use the scanner for user input
import java.util.Scanner;

public class RelationalOperators {

    public static void main(String[] args) {

        //creates a scanner variable
        Scanner scnr = new Scanner(System.in);

        //asks the users to enter two integers
        System.out.print("Please enter an integer:");
        int userInput = scnr.nextInt();
        System.out.print("Please enter another integer:");
        int userInput2 = scnr.nextInt();

        //creates variables for each boolean operator
        boolean lessThan = userInput < userInput2;
        boolean greaterThan = userInput > userInput2;
        boolean lessThanOrEqual = userInput <= userInput2;
        boolean greaterThanOrEqual = userInput >= userInput2;
        boolean equalTo = userInput == userInput2;
        boolean notEqualTo = userInput != userInput2;

        //prints out the results
        System.out.println(userInput + " < " + userInput2 + " ? " + lessThan);
        System.out.println(userInput + " <= " + userInput2 + " ? " + lessThanOrEqual);
        System.out.println(userInput + " > " + userInput2 + " ? " + greaterThan);
        System.out.println(userInput + " >= " + userInput2 + " ? " + greaterThanOrEqual);
        System.out.println(userInput + " == " + userInput2 + " ? " + equalTo);
        System.out.println(userInput + " != " + userInput2 + " ? " + notEqualTo);
    }
}