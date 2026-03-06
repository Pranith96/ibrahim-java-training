
public class MainMethod {
	
	public static void main(String[] args) {
		Example1 ex = new Example1();
		ex.start();
		ex.setName("ABC");
		ex.setPriority(1);
		
		Example1 ex2 = new Example1();
		ex2.start();
		ex2.setName("XYZ");
		ex2.setPriority(2);
	}
}
