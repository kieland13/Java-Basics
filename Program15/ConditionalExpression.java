//import so we can use the scanner for user input
import java.util.Scanner;
//import so we can use the Random for random number
import java.util.Random;

public class ConditionalExpression{

    public static void main(String[] args) {

        //creates a scanner variable
        Scanner scnr = new Scanner(System.in);

        //creates a random number variable
        Random random = new Random();
        String correct;

        //picks a random number between 0 and 5
        int rand = random.nextInt(6);
        System.out.println("Guess a number between 0 and 5");
        int number = scnr.nextInt();

        //checks if user input and random number are equal
        correct = rand == number ? "you chose the right number" : "You chose the wrong number";
        System.out.println(correct);
    }
}