package shapes;

import java.awt.Color;
import java.awt.Point;

public class Rectangle extends Shape implements Locatable {
	private double width;
	private double height;
	private Point location;
	
	public Rectangle(double width, double height, Color color, Point location) {
		super(color, location);
		this.width = width;
		this.height = height;
		this.location = location;
	}
	public Rectangle() {
		this(1, 1, Color.white, new Point (0,0));
	}
	public double getWidth() {
		return this.width;
	}
	public double getHeight() {
		return this.height;
	}
	public Point getLocation() {
		return location;
	}
	public void setWidth(double width) {
		if (width < 0 || !Double.isFinite(width)) {
			throw new IllegalArgumentException("The width should be positive and a finite/actual number");
		}
		else {
			this.width = width;
		}
	}
	public void setHeight(double height) {
		if (height < 0 || !Double.isFinite(height)) {
			throw new IllegalArgumentException("The height should be positive and a finite/actual number");
		}
		else {
			this.height = height;
		}
	}
	public double area() {
		return this.width * this.height;
	}
	public Point locate() {
		return null;
	}

}
