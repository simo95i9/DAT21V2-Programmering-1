import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args) {
        //Create Scanner object to read user input from System.in
        Scanner userInputScanner = new Scanner(System.in);

        //Ask user for input
        System.out.print("Enter a whole number: ");
        //Use Scanner object to read user input as an int
        int userInput = userInputScanner.nextInt();

        //Compute the absolute difference
        int differenceFrom21 = Math.abs(userInput - 21);

        //Let the user know the difference between their number and 21
        System.out.printf("The difference between %d and 21 is %d", userInput, differenceFrom21);
    }
}
