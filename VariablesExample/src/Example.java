
public class Example {
	// instance variable // non-static variable
	int data = 5;
	// static variable
	static int value = 15;
	
	public static void main(String[] args) {
		System.out.println("Hello, World!");
		// static variable can be accessed directly
		Example ibrahim = new Example();
		System.out.println(ibrahim.data);
		
		System.out.println(value);
		
		ibrahim.hi();
		ibrahim.display();
		welcome();
	}
	
	//non-static method
	public void hi() {
		//local variables
		int num = 10;
		
		System.out.println(data);
		System.out.println(value);

	}
	
	//non-static method
	public void display() {
		System.out.println(data);
		System.out.println(value);
	}
		
	// static method
	public static void welcome() {
		Example ex = new Example();
		System.out.println(ex.data);
		System.out.println(value);

	}
}
