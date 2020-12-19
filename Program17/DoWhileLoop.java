//import so we can use the scanner for user input
import java.util.Scanner;

public class DoWhileLoop {

    public static void main(String[] args) {

        //initializes number variable
        int number = 0;

        //print off this message while the number is less than 5,
        //increase the number by 1 each loop
        do {
            System.out.println("Hello Do While Loop");
        number++;
        }
        while (number < 5);

    }
}