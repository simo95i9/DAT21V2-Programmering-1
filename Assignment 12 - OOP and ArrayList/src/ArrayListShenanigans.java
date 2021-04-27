import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListShenanigans {

    // Exercise 3
    // Write a program that constructs an arraylist containing the numbers 1 to 100, and prints them out.
    // Then ask the user for a number,
    // remove all multiples of that number (except for the number itself) from the list,
    // print the list out again.
    //
    // For example, if the user selects 5, it will remove 10, 15, 20, 25, 30, etc from the list.

    public static void main(String[] args) {
        // Init arraylist with all numbers ∈ [0;100]
        ArrayList<Integer> numberList = new ArrayList<>();
        for (int i = 0; i <= 100; i++) {
            numberList.add(i);
        }

        System.out.println("myNumbers = " + numberList);

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a whole number and press enter: ");

        int userNumber = sc.nextInt();

        // Don't do division by zero
        if (userNumber == 0) {
            System.out.println("Nice try...");
            return;
        }

        // Because we will be modifying the list, traverse the list in reverse
        for (int i = numberList.size() - 1 ; i >= 0; i--) {
            int number = numberList.get(i);

            // if number is multiple of userNumber and number is not userNumber itself
            if (number % userNumber == 0 && number != userNumber) {
                numberList.remove(i);
            }
        }

        System.out.println("numberList = " + numberList);
    }
}
