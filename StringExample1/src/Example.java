import java.util.Arrays;

public class Example {

	public static void main(String[] args) {
		String s = "Hello welcome to Java";
		String[] str = s.split("\\s");
		System.out.println(Arrays.toString(str));
		for(int i=0;i<str.length;i++) {
			System.out.println(str[i] + " : " + str[i].length());
			
		}
	}
	// reverse printing --> ajav ot emoclew olleH
	// reverse printing --> olleH emoclew ot ajav
	// pallindrome string --> MOM --> reverse --> MOM
	// Panagram --> The quick brown fox jumps over the lazy dog -- A-Z character
	// Anagram --> LISTEN and SILENT
}
