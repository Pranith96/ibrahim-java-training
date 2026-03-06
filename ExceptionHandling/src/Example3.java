public class Example3 {

	public static void main(String[] args) {
		try {
			String s = null;
			if (s != null) {
				s = s.toUpperCase();
				System.out.println(s);
			}
		} catch (NullPointerException e) {
			e.printStackTrace();
		} finally {
			System.out.println("lock");
		}
		System.out.println("hello");
		System.out.println("welcome");
	}
}
