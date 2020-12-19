//import so we can use the scanner for user input
import java.util.Scanner;

public class HelloUserDoWhile {

    public static void main(String[] args) {

        //creates a Scanner variable
        Scanner scnr = new Scanner(System.in);
        int number = 0;
        
        //asks user for their name
        System.out.print("Enter your name: ");
        String userName = scnr.next();

        //while number is less than 5, print user name,
        //ends up printing users name 5 times
        do {
            System.out.println("Hello " + userName + "!");
        number++;
        }
        while (number < 5);

    }
}