package shapes;

public class Square {
	private float sidelength;
	private float area;
	
	public Square() {
		//this is a constructor, which constructs new objects
		sidelength = 1.0f;
		area = 1.0f;
		
	}
	
	public Square(float sideLength) {
		sidelength = sideLength;
		area = sideLength * sideLength;
	}

}
