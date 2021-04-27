import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println("\n\nExercise 1");
        printlnStringThreeTimes("Hello, World!");

        System.out.println("\n\nExercise 2");
        printNumberOfTimes(24);

        System.out.println("\n\nExercise 3");
        printHashtagsRandomly();

        System.out.println("\n\nExercise 4");
        System.out.println(upperCaseFirstChar("this was a lowercase string"));
    }

    //Exercise 1
    //Write a method that prints out ”Hello World” 3 times
    private static void printlnStringThreeTimes(String s) {
        for (int i=3; i>0; i--) {
            System.out.println(s);
        }
    }

    //Exercise 2
    //Write a method that prints out the statement ”I am now printing for the [Number of iteration]th time”.
    //Run 10 iterations.
    private static void printNumberOfTimes(int iterations) {
        for (int i=0; i<iterations; i++) {
            System.out.printf("I am now printing for the %d%s time\n", i+1, getOrdinal(i+1));
        }
    }

    private static String getOrdinal(int number) {
        int significantPart = number%20;

        if (significantPart == 1) {
            return "st";
        } else if (significantPart == 2) {
            return "nd";
        } else if (significantPart == 3) {
            return "rd";
        } else if (significantPart == 11) {
            return "th";
        } else if (significantPart == 12) {
            return "th";
        } else if (significantPart == 13) {
            return "th";
        } else {
            return "th";
        }
    }

    //Exercise 3
    //Write a method that prints a random number of hashtags # (Maximum 10)
    private static void printHashtagsRandomly() {
        Random  randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(11);

        for (int i=randomNumber; i>0; i--) {
            System.out.print("#");
        }

        System.out.println();
    }

    //Exercise 4
    //Write a method that takes a String as parameter and replaces the first
    //character with the same letter but uppercase. You can assume the string is non-empty
    private static String upperCaseFirstChar(String s) {
        String firstChar = s.substring(0,1);
        String restOfString = s.substring(1);

        return firstChar.toUpperCase() + restOfString;
    }

}
