import java.util.Random;

public class Example2 {

	public static void main(String[] args) {
		welcomeStatic();
		displayStatic("ABC");
		int res = fetchStatic();
		System.out.println("random number is " + res);
		int res1 = addStatic(10, 20);
		System.out.println("addition is " + res1);
		String res2 = birdStatic(10, 20);
		System.out.println("bird is " + res2);
	}

	// static method
	// without parameters and without return type
	public static void welcomeStatic() {
		System.out.println("welcome to java Static");
	}

	// with parameters and without return type
	public static void displayStatic(String name) {
		System.out.println("welcome to Static " + name + " java");
	}

	// without parameters and with return type
	public static int fetchStatic() {
		Random r = new Random();
		int num = r.nextInt(10);
		return num;
	}

	// with parameters and with return type
	public static int addStatic(int a, int b) {
		int sum = a + b;
		return sum;
	}
	
	public static String birdStatic(int a, int b) {
		int sum = a + b;
		System.out.println("sum is " + sum);
		String s = "parrot";
		return s;
	}
}
