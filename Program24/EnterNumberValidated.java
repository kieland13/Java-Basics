//import so we can use the scanner for user input
import java.util.Scanner;

public class EnterNumberValidated {

public static void main(String[] args) {

    //creates a Scanner variable
    Scanner scnr = new Scanner(System.in);

    //asks user to enter a number between 10 and 20
    System.out.print("Enter a number between 10 and 20: ");
    String userInput = scnr.next();
    int number = Integer.parseInt(userInput);

    //validates number is between 10 and 20, if not, type in message and
    //ask user to type again
    while (number > 20 || number < 10) {
        System.out.print("Invalid entry, try again: ");
        userInput = scnr.next();
        number = Integer.parseInt(userInput);
    }
    //prints number user entered
    System.out.println("You entered " + userInput);
}
}