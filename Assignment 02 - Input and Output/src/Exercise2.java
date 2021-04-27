import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {

        //Create Scanner object to read user input from System.in
        Scanner userInputScanner = new Scanner(System.in);

        //Ask user for input
        System.out.print("Enter a random number: ");
        //Use Scanner object to read user input as a double
        double userInput = userInputScanner.nextDouble();

        //Compute what half of the number is
        double halfOfUserInput = userInput * 0.5;

        //Let the user know what half of their number is
        System.out.printf("Half of %.3f is %.3f 🤓", userInput, halfOfUserInput);
    }
}
