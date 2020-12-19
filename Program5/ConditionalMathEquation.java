//import so we can use the scanner for user input
import java.util.Scanner;

public class ConditionalMathEquation {

    public static void main(String[] args) {

        //creates a scanner variable
        Scanner scnr = new Scanner(System.in);
        double result = 0;

        //asks the users to enter 4 integers
        System.out.print("Enter 4 numbers: ");
        double array[] = new double[4];

        //have the user type in a number for the size of the array
        //this array happens to be 4 numbers
        for (int i = 0; i < array.length; i++){
            array[i] = scnr.nextInt();
        }

        //if the third number in the arry is 0, do this
        if (array[2] == 0) {
            //if the second number in array is greater than 0, do this
            if (array[1] >= 0) {
                result = (array[0] + array[1]) * array[3];
                System.out.println("(" + array[0] + " + " + array[1] + ") * " + array[3] + " = " + result);
            //if the second number in array is not greater than 0, do this
            } else {
                result = (array[0] - array[1]) * array[3];
                System.out.println("(" + array[0] + " - " + array[1] + ") * " + array[3] + " = " + result);
            }
        //if the third number in the array is not 0, do this
        } else {
            result = (array[0] / array[2]) * array[1] + (array[3] / array[2]);
            System.out.println("(" + array[0] + "/" + array[2] + ") * " + array[1] + " + (" + array[3] + " / " + array[2] + ")" + " = " + result);
        }
    }
}