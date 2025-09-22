package shapes;

import java.awt.Color;
import java.awt.Point;

public class Testing {

	public static void main(String[] args) {
//		Square square1 = new Square();
//		Square square2 = new Square(5.0f, Color.RED, new Point(6,7));
//		
//		System.out.println("Sidelength: " + square2.getSideLength());
//		
//		square1.setSideLength(20);
//		square2.setSideLength(10);
//		
//		System.out.println("Sidelength: " + square2.getSideLength());
//		System.out.println("Sidelength:/n " + square1.getSideLength());
//		System.out.println(square1.area());
//		System.out.println(square2);
		
		Circle circle1 = new Circle();
		Circle circle2 = new Circle(6.0f, Color.blue, new Point(4,1));
		
		System.out.println(circle2);
		System.out.println("Diameter of circle1 = " + circle1.getDiameter());
		System.out.println("Radius of circle1 = " + circle1.getRadius());
		System.out.println("Area of circle1 = " + circle1.area());
		
		circle1.setDiameter(67);
		System.out.println("Diameter of circle1 = " + circle1.getDiameter());
		System.out.println("Area of circle1 = " + circle1.area());
		
	}

}
