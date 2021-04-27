public class Exercise5 {

    private static final double PI = 3.1415926535;

    public static void main(String[] args) {
        double circleRadius = 16.0;

        System.out.println("Area of circle with radius " + circleRadius + ": " + areaOfCircle(circleRadius));
        System.out.println("Perimeter of circle with radius " + circleRadius + ": " + perimeterOfCircle(circleRadius));
    }

    private static double areaOfCircle(double radius) {
        return PI *  Math.pow(radius, 2);
    }

    private static double perimeterOfCircle(double radius) {
        return 2 * PI * radius;
    }
}
