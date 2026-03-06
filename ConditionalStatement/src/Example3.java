
public class Example3 {

	public static void main(String[] args) {
		int age = 9;
		if ((age < 18) && (age > 10)) {
			System.out.println("age is: " + age);
		} else if (age > 18) {
			Example3 ex = new Example3();
			ex.welcome();
		} else {
			System.out.println("default");
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
	
	// Marks
	// 0-35 --> "Fail"
	// 36-50 --> "C Grade"
	// 51-65 --> "B Grade"
	// 66-80 --> "A Grade"
	// 81-100 --> "A+ Grade"
	// invalid number
	
	// Age
	// 0-12 --> "Child"
	// 13-19 --> "Teenager"
	// 20-35 --> "Young"
	// 36-60 --> "Adult"
	// 60+ --> "Senior Citizen"
	// 100 greater and 0 lesser --> else case --> invalid number
}
