
public class Example2 {

	public static void main(String[] args){
		int age = 7;

		validateAge(age);

		System.out.println("Welcome to vote");
		System.out.println("Java");
	}

	public static void validateAge(int age) {
		if (age < 18) {
			throw new RuntimeException("Age is not valid");
		}
	}
}
