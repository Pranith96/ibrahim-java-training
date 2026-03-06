
public class Example2 {

	public static void main(String[] args) {
		int age = 9;
		if ((age < 18) && (age > 10)) {
			System.out.println("age is: " + age);
		} else {
			Example2 ex = new Example2();
			ex.welcome();
		}

		if ((age < 18) || (age > 10)) {
			System.out.println("age is: " + age);
		}
		System.out.println("Hello");
		System.out.println("world");
	}

	public void welcome() {
		System.out.println("Welcome to Java Programming!");
	}
}
