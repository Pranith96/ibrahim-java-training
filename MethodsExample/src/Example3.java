
public class Example3 {

	public static void main(String[] args) {
		System.out.println(".................non-static method calling................");

		Example1 ex = new Example1();
		ex.welcome();
		ex.display("XYZ");
		int res = ex.fetch();
		System.out.println("random number is " + res);
		int res1 = ex.add(10, 20);
		System.out.println("addition is " + res1);
		String res2 = ex.bird(10, 20);
		System.out.println("bird is " + res2);
		System.out.println(".................static method calling................");
		Example2.welcomeStatic();
		Example2.displayStatic("ABC");
		int res3 = Example2.fetchStatic();
		System.out.println("random number is " + res3);
		int res4 = Example2.addStatic(10, 20);
		System.out.println("addition is " + res4);
		String res5 = Example2.birdStatic(10, 20);
		System.out.println("bird is " + res5);
		
		Example4 ex4 = new Example4();
		ex4.display(res5);
	}
}
