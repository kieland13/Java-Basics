//import so we can use the scanner for user input
import java.util.Scanner;

public class HelloUserWhile {

    public static void main(String[] args) {

        //creates a Scanner variable
        Scanner scnr = new Scanner(System.in);
        int number = 0;

        //asks user what their name is
        System.out.print("Enter your name: ");
        String userName = scnr.next();

        //prints off the users name 5 times
        while (number < 5) {
            System.out.println("Hello " + userName + "!");
            number++;
        }

    }
}