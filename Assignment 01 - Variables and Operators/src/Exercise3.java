public class Exercise3 {

    public static void main(String[] args) {
        double kilometers = 19.0;

        System.out.println(kilometersToMiles(kilometers));
    }

    private static double kilometersToMiles(double kilometers) {
        return kilometers / 1.609;
    }
}
