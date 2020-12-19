//import so we can use the scanner for user input
import java.util.Scanner;

public class EvenNumber {

    public static void main(String[] args) {

        //creates a scanner variable
        Scanner scnr = new Scanner(System.in);

        //ask user to enter a user and reads the typed number
        System.out.print("Enter an integer number: ");
        int number = scnr.nextInt();

        //checks if number is even and prints out results
        if (number % 2 == 0) {
            System.out.println("You entered " + number);
            System.out.println(number + " is even");
        }
    }

}