public class Exercise4 {

    public static void main(String[] args) {
        double width = 5.5;
        double height = 8.5;

        System.out.println("Area of " + width + "x" + height + " rectangle: " + areaOfRectangle(width, height));
        System.out.println("Perimeter of " + width + "x" + height + " rectangle: " + perimeterOfRectangle(width, height));
    }

    private static double areaOfRectangle(double width, double height) {
        return width * height;
    }

    private static double perimeterOfRectangle(double width, double height) {
        return 2.0*width + 2.0*height;
    }
}
