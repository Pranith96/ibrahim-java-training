
public class MainMethod {

	public static void main(String[] args) {
		int x = 20;
		Calculator calc = new Calculator();
		calc.add(10, 20);
		calc.subtract(20, 10);
		calc.welcome();
		System.out.println(calc.x);
		System.out.println(x);
	}
}
