package practiceTest;

public abstract class Animal {
	private String name;
	public Animal(String name) {
		this.name = name;
	}
	// Concrete method
	public String getName() {
	return name;
	}
	// Abstract method (must be implemented in subclasses)
	public abstract String speak();
}
