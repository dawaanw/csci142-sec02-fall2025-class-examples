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
		
		
		Vector vector = new Vector();
		
		for (int i=0; i < 11; i++) {
			vector.add(i);
			System.out.println("Size = " + vector.size() 
						+ "  Capacity = " + vector.capacity() 
						+ "  Data = " + vector.getLast());
		}

	}

}
