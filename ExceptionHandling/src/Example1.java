
public class Example1 {

	public static void main(String[] args) {
		try {
			int i = 10;
			int j = i / 0; // This will cause ArithmeticException: / by zero;
			System.out.println(j);
		} catch (ArithmeticException e) {
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("hello");
		System.out.println("welcome");

	}
}
