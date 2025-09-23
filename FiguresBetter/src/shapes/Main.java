package shapes;

import java.awt.Color;
import java.awt.Point;

public class Main {

	public static void main(String[] args) {
		Square square1 = new Square();
		Square square2 = new Square(15.0, Color.RED, new Point(0,0));
		//Shape shape = new Shape(Color.BLACK);
		
		System.out.println(square1);
		System.out.println(square2);
		
	}

}
