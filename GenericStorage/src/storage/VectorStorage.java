package storage;

import java.util.Vector;

public class VectorStorage implements Storage{
	private Vector data;
	
	public VectorStorage() {
		data = new Vector();
	}
	
	@Override
	public boolean add(Integer o) {
		return data.add(o);
	}

	@Override
	public Integer remove(int index) throws ArrayIndexOutOfBoundsException {
		return (Integer) data.remove(index);
	}

	@Override
	public int count() {
		return data.size();
	}

}
