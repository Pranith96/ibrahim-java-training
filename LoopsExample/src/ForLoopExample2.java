
public class ForLoopExample2 {

	public static void main(String[] args) {

		for (int i = 0; i < 3; i++) { //rows 0,1,2
			System.out.println(i);
			for (int j = 0; j < 3; j++) { // Columns
				System.out.println("Inner loop: " + j);
			}
		}
	}
}
