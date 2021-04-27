public class Methods {
    public static void main(String[] args) {
        //Exercise 1
        int num1 = 4;
        int num2 = 15;
        int num3 = -8;
        int sum = sumThreeInts(num1, num2, num3);
        System.out.println(sum);

        //Exercise 2
        String myMessage = "Hello, World!";
        sayItThreeTimes(myMessage);

        //Exercise 3
        double myWeightInKg = 84.5;
        double myHeightInCm = 186.0;
        double myBMI = calculateBMI(myWeightInKg, myHeightInCm);
        System.out.printf("%,.2f\n", myBMI);

        //Exercise 4
        String myPieceOfText = "The quick brown 🦊 jumps over the lazy 🐶.";
        System.out.println(turnStringToUpperCase(myPieceOfText));

        //Exercise 5
        String myString = "🇩🇰";
        System.out.println(getLengthOfString(myString));
    }

    //Exercise 1
    //Write a method that takes three integers as parameter, sums the integers andreturns the result.
    private static int sumThreeInts(int a, int b, int c) {
        return a+b+c;
    }

    //Exercise 2
    //Write a method that takes a String as parameter and prints the String thrice.The method does not return a value.
    private static void sayItThreeTimes(String s) {
        System.out.printf("%s %s %s\n", s, s, s);
    }

    //Exercise 3
    //Implement  a  BMI  calculator  in  the  scope  of  a  method.   Identify  the  neededparameters and return type.
    private static double calculateBMI(double weightInKg, double heightInCm) {
        double heightInM = heightInCm/100;
        return weightInKg / (heightInM * heightInM);
    }

    //Exercise 4
    //Write a method that takes a String as parameter and returns the String in full uppercase.
    private static String turnStringToUpperCase(String s) {
        return s.toUpperCase();
    }

    //Exercise 5
    //Write  a  method  that  takes  a  String  as  parameter  and  returns  the  amount  ofcharacters in the given String.
    //Hint:  Use a method called [string].length();to identify the length of a String.
    private static int getLengthOfString(String s) {
        return s.length();
    }
}
