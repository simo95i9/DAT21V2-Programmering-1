import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        //Create a Scanner object to read user input from System.in
        Scanner userInputScanner = new Scanner(System.in);

        //Ask the user for their name and save in String variable
        System.out.print("Please enter you name: ");
        String name = userInputScanner.nextLine();

        //Ask the user for their age and save in String variable so we don't need to cast it later
        System.out.print("Please enter you age: ");
        String age = userInputScanner.nextLine();

        //Ask the user for their height with units and save in String variable
        System.out.print("Please enter you height with units: ");
        String height = userInputScanner.nextLine();

        //Ask the user for their occupation and save in String variable
        System.out.print("Please enter you occupation: ");
        String occupation = userInputScanner.nextLine();

        //Print all their info back to System.out
        System.out.printf("Name: %s\nAge: %s\nHeight: %s\nOccupation: %s\n",
                                 name,    age,        height,         occupation);
    }
}
