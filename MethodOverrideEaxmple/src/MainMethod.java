
public class MainMethod {

	public static void main(String[] args) {
		int x = 20;
		Calculator calc = new Calculator(); // object creation compiletime
		calc.add(10, 20);
		calc.welcome();
		System.out.println(x);
		// multiplication
		System.out.println("/............................");
		Addition add = new Calculator(); // runtime polymorphism -- runtime
		add.add(100, 200);
	}
}
