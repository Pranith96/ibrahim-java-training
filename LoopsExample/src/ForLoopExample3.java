
public class ForLoopExample3 {

	public static void main(String[] args) {

		int count = 0;
		for (int i = 0; i < 3; i++) { //rows 0,1,2
			for (int j = 0; j < 3; j++) { // Columns
				System.out.print(count);
				count++;
			}
			System.out.println();
		}
	}
}
