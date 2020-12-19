//import so we can use the scanner for user input
import java.util.Scanner;

public class SwitchStatement {

    public static void main(String[] args) {

        //creates a scanner variable
        Scanner scnr = new Scanner(System.in);

        //asks user what month they are born in
        System.out.println("What month were you born in?(choose 1 - 12)");

        //takes the number and stores it in numberWorth variable
        int numberMonth = scnr.nextInt();
        String month;

        //depending on what number user types in,
        //print off month that had that number
        switch(numberMonth) {
            case 1: month = "January";
            break;
            case 2: month = "February";
            break;
            case 3: month = "March";
            break;
            case 4: month = "April";
            break;
            case 5: month = "May";
            break;
            case 6: month = "June";
            break;
            case 7: month = "July";
            break;
            case 8: month = "August";
            break;
            case 9: month = "September";
            break;
            case 10: month = "October";
            break;
            case 11: month = "November";
            break;
            case 12: month = "December";
            break;
            default: month = "Wrong month";
            break;
        }
        //print off month user was born in depending on what number they chose
        System.out.println("You were born in the month of " + month);
    }
}