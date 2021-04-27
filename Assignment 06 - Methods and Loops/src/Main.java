import java.util.Random;

public class Main {

    public static void main(String[] args) {
        //Exercise 2
        String myString = "The quick brown 🦊 jumps over the lazy 🐶.";
        int repetitions = 7;
        printStringMultipleTimes(myString, repetitions);

        //Exercise 3
        int myNumber = randomNumberBetween(100, 500);

        //Time how fast loop method is
        //Get current system time.
        long startTimeLoop = System.nanoTime();
        //Run method to sum from 0 to n
        int sumLoop = sumIntegersFrom0ToNWithLoop(myNumber);
        //Get current system time after running method.
        long endTimeLoop = System.nanoTime();
        //Calculate how much time elapsed. Divide to get milliseconds.
        double durationLoop = (endTimeLoop - startTimeLoop) / 1_000_000.0;

        //Time how fast math method is.
        long startTimeMath = System.nanoTime();
        int sumMath = sumIntegersFrom0ToNWithMath(myNumber);
        long endTimeMath = System.nanoTime();
        double durationMath = (endTimeMath - startTimeMath) / 1_000_000.0;

        //Display results of timing and summation from both methods.
        System.out.printf("(Loop %fms) Sum of integers from 0 to %d = %d\n", durationLoop, myNumber, sumLoop);
        System.out.printf("(Math %fms) Sum of integers from 0 to %d = %d\n", durationMath, myNumber, sumMath);
    }

    //Exercise 2
    //Write a method that takes 2 parameters: A string and an integer.
    //The method prints the string the amount of times dictated by the integer
    private static void printStringMultipleTimes(String stringToPrint, int numberOfTimes) {
        for (int i=numberOfTimes; i>0; i--) {
            System.out.println(stringToPrint);
        }
    }

    //Exercise 3
    //Write a method that takes 1 integer parameter n.
    //The method sums integers from 0 to n and returns the sum.
    private static int sumIntegersFrom0ToNWithLoop(int n) {
        int sum = 0;
        for (int i=n; i>0; i--) {
            sum += i;
        }
        return sum;
    }

    //Using math instead of a loop is often 4-10x faster than the loop. I tested it.
    private static int sumIntegersFrom0ToNWithMath(int n) {
        return (n * (n+1)) / 2;
    }

    private static int randomNumberBetween(int lowerBound, int upperBound) {
        return new Random().nextInt(upperBound-lowerBound)+lowerBound;
    }

}