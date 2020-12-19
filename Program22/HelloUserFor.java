//import so we can use the scanner for user input
import java.util.Scanner;

public class HelloUserFor {

    public static void main(String[] args) {

        //creates a Scanner variable
        Scanner scnr = new Scanner(System.in);

        //asks user for their name
        System.out.print("Enter your name: ");
        String userName = scnr.next();

        //prints user name 5 times
        for (int x = 0; x < 5; x++)
        {
            System.out.println("Hello " + userName + "!");
        }

    }
}