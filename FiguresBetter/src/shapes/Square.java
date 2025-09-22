package shapes;

import java.awt.Color;
import java.awt.Point;

public class Square extends Shape implements Locatable {
	private double sideLength;
	private Point location;
	public Square() {
		//this is a constructor, which constructs new objects
		this(1.0, Color.white, new Point(0,0));
		
	}
	
	public Square(double sideLength, Color color, Point location) {
		super(color, location);
		this.location = location;
		this.sideLength = sideLength;
		
		
	}
	public double getSideLength() {
			return sideLength;	
	}
	public Point getLocation() {
		return location;
	}
	public void setSideLength(double sideLength) {
		if (sideLength < 0 || !Double.isFinite(sideLength)) {
			throw new IllegalArgumentException("Side length should be positive and a finite/actual number");
		}
		else {
			this.sideLength = sideLength;
		}
	}
	public double area() {
		return this.sideLength * this.sideLength;
	}

	@Override
	public Point locate() {
		return null;
	}
	
}
