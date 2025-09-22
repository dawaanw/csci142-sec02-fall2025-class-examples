package shapes;

public class Square {
	private double sideLength;
	
	public Square() {
		//this is a constructor, which constructs new objects
		this.sideLength = 1;
	}
	
	public Square(float sideLength) {
		this.sideLength = sideLength;
	}
	public double getSideLength() {
			return sideLength;	
		
		
	}
	public void setSideLength(float sideLength) {
		if (sideLength < 0 || !Double.isFinite(sideLength)) {
			throw new IllegalArgumentException("Side length should be positive and a finite/actual number");
		}
		else {
			this.sideLength = sideLength;
		}
	}
	public double getArea() {
		return this.sideLength * this.sideLength; 
	}
	
}
