import java.util.ArrayList;

public class Geometry {
	
	public static void main(String[] args) {
		
		ArrayList<Shape> shapes = new ArrayList<>();
		shapes.add( new Square(5.0) );
		shapes.add( new Square(6.0) );
		shapes.add( new Rectangle(5.0, 3.0) );
		shapes.add( new Rectangle(7.5, 3.5) );
		shapes.add( new Circle(Math.PI) );
		shapes.add( new Circle(100.0) );
		
		for (Shape shape : shapes) {
			System.out.println(shape);
			System.out.println("area="+shape.area());
			System.out.println("perimeter="+shape.perimeter());
			System.out.println();
		}
		
	}
}


// Abstract shape class to define how a shape behaves.
// All implementations are in the child classes.
// Since this class has no behavior of its own, it could also be an interface.
abstract class Shape {
	
	abstract public Double area();
	abstract public Double perimeter();
	abstract public String toString();
}


// Child classes extends the shape and implements the classes that were marked as abstract
class Square extends Shape {
	
	private Double length;
	
	public Square(Double length) {
		this.length = length;
	}
	
	@Override
	public Double area() {
		return Math.pow(length, 2);
	}
	
	@Override
	public Double perimeter() {
		return 4 * length;
	}
	
	@Override
	public String toString() {
		return String.format("Square{length=%f}", this.length);
	}
	
	public Double getLength() {
		return this.length;
	}
	
	public void setLength(Double length) {
		this.length = length;
	}
}

class Rectangle extends Shape {
	
	private Double lengthA;
	private Double lengthB;
	
	
	public Rectangle(Double lengthA, Double lengthB) {
		this.lengthA = lengthA;
		this.lengthB = lengthB;
	}
	
	@Override
	public Double area() {
		return lengthA*lengthB;
	}
	
	@Override
	public Double perimeter() {
		return 2*lengthA+2*lengthB;
	}
	
	@Override
	public String toString() {
		return String.format("Rectangle{lengthA=%f, lengthB=%f}", this.lengthA, this.lengthB);
	}
	
	public Double getLengthA() {
		return this.lengthA;
	}
	
	public void setLengthA(Double lengthA) {
		this.lengthA = lengthA;
	}
	
	public Double getLengthB() {
		return this.lengthB;
	}
	
	public void setLengthB(Double lengthB) {
		this.lengthA = lengthB;
	}
}

class Circle extends Shape  {
	
	private Double radius;
	
	public Circle(Double radius) {
		
		this.radius = radius;
	}
	
	@Override
	public Double area() {
		return Math.pow(this.radius, 2) * Math.PI;
	}
	
	@Override
	public Double perimeter() {
		return 2 * Math.PI * this.radius;
	}
	
	@Override
	public String toString() {
		return String.format("Circle{radius=%f", this.radius);
	}
	
	public Double getRadius() {
		return radius;
	}
	
	public void setRadius(Double radius) {
		this.radius = radius;
	}
}


