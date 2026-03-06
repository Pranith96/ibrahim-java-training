
public class Example4 {

	public static void main(String[] args) {
		char ch = 'U';

		switch (ch) {
		case 'A':
			System.out.println("Is vowel");
			break;
		case 'E':
			System.out.println("Is vowel");
			break;
		case 'I':
			System.out.println("Is vowel");
			break;
		case 'O':
			System.out.println("Is vowel");
			break;
		case 'U':
			System.out.println("Is vowel");
			break;
		default:
			System.out.println("Is consonant");
			break;
		}
		
		if(ch == 'A') {
			System.out.println("Is vowel");
		} else if (ch == 'E') {
			System.out.println("Is vowel");
		} else if (ch == 'I') {
			System.out.println("Is vowel");
		} else if (ch == 'O') {
			System.out.println("Is vowel");
		} else if (ch == 'U') {
			System.out.println("Is vowel");
		} else {
			System.out.println("Is consonant");
		}
	}
}
