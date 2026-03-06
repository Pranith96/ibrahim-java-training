
public class Example4 {

	public static void main(String[] args) {

		// 0 0 0 0
		// 1 1 1
		// 2 2
		// 3

		int count = 0;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4 - i; j++) {
				System.out.print(count + " ");
			}
			for (int k = 0; k < 1; k++) {
				System.out.println();
			}
			count++;
		}
		//1 2 3 4
		//5 6 7 
		//8 9 
		//10
	}
}
