import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        //Create Scanner object to read user input from System.in
        Scanner userInputScanner = new Scanner(System.in);

        //Ask user for their height
        System.out.print("Please enter your height in [cm]: ");
        //Use Scanner object to read user input as a string
        double heightInCm = userInputScanner.nextDouble();
        //Convert centimeters to meters
        double heightInMeter = heightInCm / 100;

        //Ask user for their weight
        System.out.print("Please enter your weight in [kg]: ");
        //Use Scanner object to read user input as a string
        double weightInKg = userInputScanner.nextDouble();

        //Calculate the bmi
        double bmi = (weightInKg) / (heightInMeter  * heightInMeter);

        //Tell the user their bmi
        System.out.printf("Your BMI is %.2f", bmi);

        //Tell the user what their bmi means (obese, overweight, normal weight, underweight)
        // underweight < 18.5
        // 18.5 <= normal weight < 25.0
        // 25.0 <= overweight < 30.0,
        // obese > 30.0

        
        if (bmi > 30.0) {
            System.out.println(", meaning you are categorized obese.");
        } else if (bmi >= 25.0) {
            System.out.println(", meaning you are categorized overweight.");
        } else if (bmi >= 18.5) { //
            System.out.println(", meaning you are categorized normal weight.");
        } else { //
            System.out.println(", meaning you are categorized underweight.");
        }
    }

}
