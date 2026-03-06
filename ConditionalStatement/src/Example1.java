
public class Example1 {

	public static void main(String[] args) {
		int age = 9;
		if ((age < 18) || (age > 10)) {
			System.out.println("age is: " + age);
			Example1 ex = new Example1();
			ex.welcome();
		}
		
		if ((age < 18) && (age > 10)) {
			System.out.println("age is: " + age);
		}
		System.out.println("Hello");
		System.out.println("world");
	}
	
	
	public void welcome() {
		System.out.println("Welcome to Java Programming!");
	}
}
