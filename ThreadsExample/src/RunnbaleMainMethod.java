
public class RunnbaleMainMethod {

	public static void main(String[] args) {
		Example2 ex = new Example2();
		Thread t1 = new Thread(ex);
		t1.start();
	}
}
