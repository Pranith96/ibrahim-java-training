
public class Calculator extends Addition {
	public void welcome() {
		System.out.println("Welcome to Calculator");
	}
	
	public void add(int a, int b) {
		super.add(a, b); // Calls the add method from Addition class
		//super("welcome");
		System.out.println("Calculator: " + (a / b)); // New functionality);
	}
}
