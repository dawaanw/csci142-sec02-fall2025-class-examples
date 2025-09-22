package shapes;
import java.awt.Color;
import java.awt.Point;
public class Circle extends Shape implements Locatable{
	private double diameter;
	private double radius;
	private Point location;
	public Circle() {
		this(1.0, Color.white, new Point(0,0));
	}
	public Circle(double diameter, Color color, Point location) {
		super(color, location);
		this.diameter = diameter;
		this.location = location;
		
	}
	public double getRadius() {
	 return radius = this.diameter/2;
	}
	public double getDiameter() {
		return diameter;
	}
	public void setDiameter(double diameter) {
		if (diameter < 0 || !Double.isFinite(diameter)) {
			throw new IllegalArgumentException("The diameter should be positive and a finite/actual number");
		}
		else {
			this.diameter = diameter;
			this.radius = diameter / 2.0;
		}
	}
	public double area() {
		return Math.PI * (this.radius * this.radius);
	}
	public Point getLocation() {
		return this.location;
	}
	@Override
	public Point locate() {
		return null;
	}

}
