import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Exercise 1
        //Create an Arraylist of Strings. Add 5 Strings to the Arraylist and print the Strings
        System.out.println("\n\n===== Exercise 1 =====");
        ArrayList<String> myStrings = new ArrayList<>();
        myStrings.add("Apple");
        myStrings.add("Cucumber");
        myStrings.add("Tomato");
        myStrings.add("Potato");
        myStrings.add("Carrot");

        System.out.println("myStrings = " + myStrings);


        //Exercise 2
        //Print the Strings from the last index to the first (reverse order).
        System.out.println("\n\n===== Exercise 2 =====");
        for (int i = myStrings.size()-1; i >= 0; i--) {
            System.out.println(myStrings.get(i));
        }


        //Exercise 3
        // Write a method that takes int n, int k & an Arraylist of Strings as parameter.
        // The method will only print the strings from index n (inclusive) to index k (exclusive).
        System.out.println("\n\n===== Exercise 3 =====");
        printFromNToK(myStrings, 2, 5);


        //Exercise 4
        //Write a method that prompt the user for a String.
        // The user enters a String, the strings is added to an Arraylist & the user is prompted again.
        // If the user enters ”no strings attached” the program will terminate.
        System.out.println("\n\n===== Exercise 4 =====");
        promptForStrings();


        //Exercise 5
        //Write a method that takes int n, int k & an Arraylist of Strings as parameter.
        // The method will swap the elements of index n & index k.
        // Print the Arraylist before & after swapping.
        // You can assume the arraylist is non-empty
        System.out.println("\n\n===== Exercise 5 =====");
        swapNAndK(myStrings, 1, 4);


        //Exercise 6
        //Write a method that prompt the user for a String.
        //The user enters a String and the method returns an ArrayList of the characters in the String.
        System.out.println("\n\n===== Exercise 6 =====");
        System.out.println(stringAsCharacterArrayList(myStrings.get(3)));
    }


    private static <E> void printFromNToK(ArrayList<E> list, int n, int k) {
        if (n < 0 || k < 0) {
            throw new IllegalArgumentException("n and k must be bigger than 0");
        }
        if (n > list.size() || k > list.size()) {
            throw new IllegalArgumentException("n and k must be not be larger than list");
        }

        for (int i = n; i<k; i++) {
            System.out.println(list.get(i));
        }
    }

    private static void promptForStrings() {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> userStrings = new ArrayList<>();
        final String stopString = "no strings attached";
        boolean shouldContinue = true;

        while (shouldContinue) {
            System.out.print("Please enter a string and press enter! : ");

            String userString = sc.nextLine();

            if (userString.equalsIgnoreCase(stopString)) {
                shouldContinue = false;
            }

            userStrings.add(userString);
        }
        System.out.println(userStrings);
    }

    private static <E> void swapNAndK(ArrayList<E> list, int n, int k) {
        System.out.println(list);

        E elementN = list.get(n);
        E elementK = list.get(k);

        list.set(n, elementK);
        list.set(k, elementN);

        System.out.println(list);
    }

    private static ArrayList<Character> stringAsCharacterArrayList(String string) {
        ArrayList<Character> characters = new ArrayList<>();

        for (int i = 0; i < string.length(); i++) {
            characters.add(string.toCharArray()[i]);
        }

        return characters;
    }

}
