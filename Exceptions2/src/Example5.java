
public class Example5 {

	public static void main(String[] args) throws UserNotFoundException {
		int age = 3;

		try {
			validateAge(age);
		} catch (Exception e) {
			//e.printStackTrace();
			throw new UserNotFoundException(e.getMessage());
		}
		System.out.println("Welcome to vote");
		System.out.println("Java");
	}

	public static void validateAge(int age) {
		if (age < 18) {
			throw new AgeInvalidException("Age is not valid");
		}
		validateData(age);
		System.out.println("Spring framework");
	}

	public static void validateData(int data) {
		int a = data/0;
		System.out.println(a);
	}
}

// A --> B --> C--> D--> E