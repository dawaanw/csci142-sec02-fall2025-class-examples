package storage;

import java.util.Vector;

public class Vectors {

	public static void main(String[] args) {
		
		/*
		 * An array is a contiguous block of memory of fixed size
		 * and holding homogeneous data.
		 */
		
//		int[] values = {0, 1, 2, 3, 4};
//		
//		values[5] = 5;
//		
//		for (int i = 0; i < 5; i++) {
//			System.out.println("value = " + values[i]);
//		}
		
		
		Vector vector = new Vector(2500, 500);
		
		for (int i=0; i < 100; i++) {
			/*
			 * vector.add(i) adds the simple type "i" to the vector
			 * by "autoboxing", i.e. turning it into an Integer object
			 */
			boolean success = vector.add(i);
			
			/* 
			 * vector.add() below explicitly turns "i" into an object, 
			 * so no "autoboxing"
			 */
			success = vector.add(Integer.valueOf(i));
			
			System.out.println("Size = " + vector.size() 
						+ "  Capacity = " + vector.capacity() 
						+ "  Data = " + vector.getLast()
						+ "  Success = " + success);
		}

	}

}
