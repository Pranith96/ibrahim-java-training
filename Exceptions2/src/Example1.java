
public class Example1 {

	public static void main(String[] args) {
		int age = 7;

		if (age < 18) {
			throw new RuntimeException("Age is not valid");
		}

		System.out.println("Welcome to vote");
		System.out.println("Java");
	}
}
