
public class MainMethod2 {
	
	public static void main(String[] args) throws InterruptedException {
		Example1 ex = new Example1();
		ex.start();
		ex.join();
		
		Example1 ex2 = new Example1();
		ex2.start();
	}
}
