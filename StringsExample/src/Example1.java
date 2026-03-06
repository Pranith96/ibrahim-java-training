
public class Example1 {

	public static void main(String[] args) {
		String s = "Hello";
		String s1 = "Hello";
		String s2 = new String("Hello");
		String s3 = new String("Hello");


		boolean b = (s == s1);
		System.out.println(b);
		boolean b1 = (s == s2);
		System.out.println(b1);
		boolean b2 = (s3 == s2);
		System.out.println(b2);
		
		boolean b3 = s3.equals(s2);
		System.out.println(b3);
	}
}
