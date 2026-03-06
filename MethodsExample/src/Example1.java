import java.util.Random;

public class Example1 {

	public static void main(String[] args) {
		Example1 obj = new Example1();
		obj.welcome();
		obj.display("ABC");
		int res = obj.fetch();
		System.out.println("random number is " + res);
		int res1 = obj.add(10, 20);
		System.out.println("addition is " + res1);
		String res2 = obj.bird(10, 20);
		System.out.println("bird is " + res2);
	}

	// non-static method
	// without parameters and without return type
	public void welcome() {
		System.out.println("welcome to java");
	}

	// with parameters and without return type
	public void display(String name) {
		System.out.println("welcome to " + name + " java");
	}

	// without parameters and with return type
	public int fetch() {
		Random r = new Random();
		int num = r.nextInt(10);
		return num;
	}

	// with parameters and with return type
	public int add(int a, int b) {
		int sum = a + b;
		return sum;
	}
	
	public String bird(int a, int b) {
		int sum = a + b;
		System.out.println("sum is " + sum);
		String s = "parrot";
		return s;
	}
}
