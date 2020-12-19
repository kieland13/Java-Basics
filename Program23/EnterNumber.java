//import so we can use the scanner for user input
import java.util.Scanner;

public class EnterNumber {

public static void main(String[] args) {

    //creates a Scanner variable
    Scanner scnr = new Scanner(System.in);

    //asks user to enter a number between 10 and 20
    System.out.print("Enter a number between 10 and 20: ");
    String userInput = scnr.next();
    int number = Integer.parseInt(userInput);

    //prints the results
    System.out.println("You entered " + userInput);
}
}