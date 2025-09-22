package shapes;

import java.awt.Color;
import java.awt.Point;

public abstract class Shape implements Locatable{
	private final Color color;
	private Point location;
	public abstract double area();
	
	public Shape(Color color, Point location) {
		if (color == null) {
			throw new IllegalArgumentException("color must not be null");
		}
		this.color = color;
		if (location == null) {
			throw new IllegalArgumentException("location must not be null");
		}
		this.location = location;
	}
	public final Color getColor() {
		return color;
	}
	@Override
	public String toString() {
		return getClass().getSimpleName() + "{color=" + color + "}" + " {location=" + location.x + "," + location.y + "}";	}
}

