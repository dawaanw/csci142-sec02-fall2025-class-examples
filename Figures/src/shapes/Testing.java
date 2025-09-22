package shapes;

public class Testing {

	public static void main(String[] args) {
		Square square1 = new Square();
		Square square2 = new Square(5.0f);
		
		System.out.println("Sidelength: " + square2.getSideLength());
		
		square1.setSideLength(20);
		square2.setSideLength(10);
		
		System.out.println("Sidelength: " + square2.getSideLength());
		System.out.println("Sidelength: " + square1.getSideLength());
	}

}
