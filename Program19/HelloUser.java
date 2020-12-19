//import so we can use the scanner for user input
import java.util.Scanner;

public class HelloUser {

    public static void main(String[] args) {

        //creates a Scanner variable
        Scanner scnr = new Scanner(System.in);
        int number = 0;

        //ask user to enter their name
        System.out.print("Enter your name: ");
        String userName = scnr.next();

        //prints off users name
        System.out.println("Hello " + userName + "!");
    }
}