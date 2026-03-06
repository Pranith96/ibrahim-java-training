
public class Example4 {

	public static void main(String[] args) throws Exception {
		int age = 30;

		try {
			validateAge(age);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
		System.out.println("Welcome to vote");
		System.out.println("Java");
	}

	public static void validateAge(int age) throws Exception {
		if (age < 18) {
			throw new Exception("Age is not valid");
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