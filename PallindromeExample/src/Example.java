import java.util.Arrays;

public class Example {
	// pallindrome string

	public static void main(String[] args) {
		String s = "MADAM"; // --> ABCDEEDCBA
		char ch[] = s.toCharArray();
		System.out.println(Arrays.toString(ch));

		char b[] = new char[ch.length];
		int count = 0;
		for (int i = ch.length - 1; i >= 0; i--) {
			b[count] = ch[i];
			count++;
		}

		System.out.println(Arrays.toString(b));

		if (Arrays.equals(ch, b)) {
			System.out.println("Pallindrome String");
		}

		int l = 0;
		int k = 0;
		boolean isPallindrome = true;
		while (l < ch.length && k < b.length) {
			if (ch[l] != b[k]) {
				isPallindrome = false;
				break;
			}
			l++;
			k++;
		}

		if (isPallindrome) {
			System.out.println("Pallindrome String");
		} else {
			System.out.println("Not a Pallindrome String");
		}
	}
}
