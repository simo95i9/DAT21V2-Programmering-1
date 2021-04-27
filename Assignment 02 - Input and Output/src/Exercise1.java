import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {
        //Create Scanner object to read user input from System.in
        Scanner userInputScanner = new Scanner(System.in);

        //Ask user for input
        System.out.println("Please enter text as input:");
        //Use Scanner object to read user input as a string
        String userInput = userInputScanner.nextLine();

        //Echo the string back to the user.
        System.out.println(userInput);
    }
}
