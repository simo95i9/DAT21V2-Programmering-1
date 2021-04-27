import java.util.ArrayList;
import java.util.Random;

public class Geometry {
	public static void main(String[] args) {
		
		ArrayList<Shape> myShapes = new ArrayList<>();
		
		Rectangle myRectangle = new Rectangle(34.5, 23.0);
		Circle myCircle = new Circle(Point.atOrigin(), 50.0);
		Triangle myTriangle = new Triangle( Point.atRandom(10), Point.atRandom(10), Point.atRandom(10) );
		Triangle myOtherTriangle = new Triangle( new Point(0.0, 0.0), new Point(10.0, 0.0), new Point(5.0, 10.0) );
		
		myShapes.add(myRectangle);
		myShapes.add(myCircle);
		myShapes.add(myTriangle);
		
		for (Shape shape : myShapes) {
			System.out.println( shape.getClass().getName() );
			System.out.printf( "Perimeter: %,.3f\n", shape.calculatePerimeter() );
			System.out.printf( "Area: %,.3f\n", shape.calculateArea() );
			System.out.println();
			
		}
	}
}

abstract class Shape {
	
	abstract public Double calculatePerimeter();
	abstract public Double calculateArea();
}

class Point {
	private Double x;
	private Double y;
	
	public Point(Double x, Double y) {
		this.x = x;
		this.y = y;
	}
	
	public static Double distance(Point A, Point B) {
		Double dX = A.x - B.x;
		Double dY = A.y - B.y;
		return Math.hypot(dX, dY);
		
	}
	
	public static Point atOrigin() {
		return new Point(0.0, 0.0);
	}
	
	public static Point atRandom(Integer magnitude) {
		Random rnd = new Random();
		
		Double x = 2 * magnitude * rnd.nextDouble() - magnitude;
		Double y = 2 * magnitude * rnd.nextDouble() - magnitude;
		
		return new Point(x, y);
	}
	
	public Double getX() {
		return this.x;
	}
	
	public Double getY() {
		return this.y;
	}
	
}


class Rectangle extends Shape {
	private final Double width;
	private final Double height;

	
	public Rectangle(Double width, Double height) {
		this.width = width;
		this.height = height;
	}
	
	public Double calculatePerimeter() {
		return 2 * width + 2 * height;
	}
	
	public Double calculateArea() {
		return width * height;
		
	}
	
}

class Triangle extends Shape {
	private final Point A;
	private final Point B;
	private final Point C;
	
	public Triangle(Point A, Point B, Point C) {
		this.A = A;
		this.B = B;
		this.C = C;
	}
	
	public Double calculatePerimeter() {
		Double AB = Point.distance(this.A, this.B);
		Double BC = Point.distance(this.B,  this.C);
		Double CA = Point.distance(this.C, this.A);
		
		return AB+BC+CA;
	}
	
	public Double calculateArea() {
		// https://keisan.casio.com/exec/system/1223520411
		
		Double magic = 
				A.getX() * B.getY() + 
				B.getX() * C.getY() +
				C.getX() * A.getY() -
				A.getY() * B.getX() -
				B.getY() * C.getX() -
				C.getY() * A.getX(); 
		
		
		return Math.abs( magic / 2 );
		
	}
}

class Circle extends Shape {
	private final Point center;
	private final Double radius;
	
	public Circle(Point center, Double radius) {
		this.center = center;
		this.radius = radius;
	}
	
	public Double calculatePerimeter() {
		// O = 2πr
		return 2 * Math.PI * this.radius;
	}
	
	public Double calculateArea() {
		// A = πr²
		return Math.PI * Math.pow(this.radius, 2);
	}
	
}



