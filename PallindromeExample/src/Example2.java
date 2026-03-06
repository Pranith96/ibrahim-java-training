import java.util.Arrays;

public class Example2 {
	// pallindrome string

	public static void main(String[] args) {
		String s = "MADAM"; // --> ABCDEEDCBA
		int l = 0;
		int k = s.length() - 1;
		boolean isPallindrome = true;
//		Arrays.sort(s.toCharArray());
//		System.out.println(s);
		while (l < k) {
			if (s.charAt(l) != s.charAt(k)) {
				isPallindrome = false;
				break;
			}
			l++;
			k--;
		}

		if (isPallindrome) {
			System.out.println("Pallindrome String");
		} else {
			System.out.println("Not a Pallindrome String");
		}
	}
}
//Anagram --> LISTEN and SILENT -> Arrays.sort()
//Panagram --> The quick brown fox jumps over the lazy dog -- A-Z character
// print even char from string -------------------------------
// even number, odd number-------------------------------
//Isomorphic String --> ADDFD and EGGJG
//Fizz Buzz----------------------------------------------
//7.	Fibonocii number --> 0,1,1,2,3,5,8,13...----------------------------------
//8.	Factorial/ factorial recursion --> 5! => 5x4x3x2x1 ==> 120------------------------------------------------