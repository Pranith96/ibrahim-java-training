
public class Example3 {

	public static void main(String[] args) throws Exception {
		int age = 7;

		validateAge(age);

		System.out.println("Welcome to vote");
		System.out.println("Java");
	}

	public static void validateAge(int age) throws Exception {
		if (age < 18) {
			throw new Exception("Age is not valid");
		}

		System.out.println("Spring framework");
	}
}
