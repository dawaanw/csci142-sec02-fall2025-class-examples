package practiceTest;

public class Test {
	public static void main(String[] args) {
		Dog pet1 = new Dog("Buddy");
		Cat pet2 = new Cat("Mittens");
		
		System.out.println(pet1.getName());
		System.out.println(pet2.getName());
		System.out.println(pet1.speak());
		System.out.println(pet2.speak());
	}
}
