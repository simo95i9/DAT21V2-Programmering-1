import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //Exercise 2
        //Define some strings
        String[] myStrings = {"Hello, World!", "Seashells", "Fortnite", "Doggos", "Grapefruit"};
        //Print the string at the given index
        printNthString(myStrings, 2);

        //Exercise 3
        //Create some random numbers
        int[] myNumbers = createRandomNumbers(100, 100, 10000);
        //Use my method to find the biggest number
        int biggestNumber = max(myNumbers);

        System.out.println("Numbers: " + arrayAsString(myNumbers));
        System.out.println("Biggest number: " + biggestNumber);
    }

    //Exercise 2
    //Write a method that takes two parameters:
    //  - An array of Strings
    //  - An integer n
    //The method prints the String on the nth index.
    private static void printNthString(String[] strings, int n) {
        String nthString = strings[n];
        System.out.println(nthString);
    }

    //Exercise 3
    //Write a method that takes a single parameter:
    //  - An array of integers
    //The method returns the highest value from the array
    private static int max(int[] numbers) {
        //A place to save out biggest number
        int biggestNumber = Integer.MIN_VALUE;

        //Traverse the array using enhanced for-loop, since we only care about value
        //Every round save the biggest of the current number in array and the previously-found biggest number
        for (int number : numbers) {
            biggestNumber = Integer.max(biggestNumber, number);
        }

        //Return the biggest number
        return biggestNumber;
    }

    //Create $amount random numbers between $lower and $upper (inclusive)
    private static int[] createRandomNumbers(int amount, int lower, int upper) {
        Random rng = new Random();
        int span = Math.abs(upper + 1 - lower);

        int[] randomNumbers = new int[amount];
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = rng.nextInt(span) + lower;
        }

        return randomNumbers;
    }

    //Transform an array of integers into a human-readable string
    private static String arrayAsString(int[] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("{ ");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                sb.append(array[i]);
            } else {
                sb.append(array[i]);
                sb.append(", ");
            }
        }
        sb.append(" }");
        return sb.toString();
    }
}
