import java.util.Arrays;

public class Example2 {

	public static void main(String[] args) {
		String s = "Hello";
		s = s.concat("World");
		System.out.println(s);

		s = s.toLowerCase();
		System.out.println(s);

		s = s.toUpperCase();
		System.out.println(s);
		char ch = s.charAt(1);
		System.out.println(ch);
		boolean b = s.contains("LO");
		System.out.println(b);
		boolean b1 = s.equalsIgnoreCase("heLloWorlD");
		System.out.println(b1);
		int hashcode = s.hashCode();
		System.out.println(hashcode);
		int index = s.indexOf('D');
		System.out.println(index);
		String s1 = "     ";
		boolean b3 = s1.isBlank();
		System.out.println(b3);
		boolean b2 = s1.isEmpty(); // "";
		System.out.println(b2);
		String s3 = "    Hello    ";
		System.out.println(s3);
		s3 = s3.trim();
		System.out.println(s3);
		int length = s3.length();
		System.out.println(length);
		char ch1[] = s3.toCharArray();
		System.out.println(ch1);
		System.out.println(Arrays.toString(ch1));
		boolean b6 = s3.startsWith("k");
		boolean b7 = s3.endsWith("P");
		System.out.println(b6);
		System.out.println(b7);
		String s4 = s3.replace('l', 'P');
		System.out.println(s4);
		
		StringBuilder sb = new StringBuilder("Hello");
		sb.reverse();
	}
}