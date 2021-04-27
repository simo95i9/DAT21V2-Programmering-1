import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        //Create Scanner object to read user input from System.in
        Scanner userInputScanner = new Scanner(System.in);

        //Ask user for input
        System.out.println("Please enter five numbers, press enter or space between each:");

        //Use the Scanner object to read a double from System.in five times
        double firstNumber = userInputScanner.nextDouble();
        double secondNumber = userInputScanner.nextDouble();
        double thirdNumber = userInputScanner.nextDouble();
        double fourthNumber = userInputScanner.nextDouble();
        double fifthNumber = userInputScanner.nextDouble();

        //Calculate the sum
        double sum = firstNumber + secondNumber + thirdNumber + fourthNumber + fifthNumber;

        //Calculate the avg
        double avg = sum / 5;

        //Tell the user the sum and average fo their five numbers.
        System.out.printf("The sum of those five numbers is %.2f and the average is %.2f", sum, avg);
    }
}
