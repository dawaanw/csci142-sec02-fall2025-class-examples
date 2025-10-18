package storage;

public interface Storage {
	boolean add(Integer o);
	Integer remove(int index);
	int count();
}
