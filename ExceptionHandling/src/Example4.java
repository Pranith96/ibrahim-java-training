public class Example4 {

	public static void main(String[] args) {
		try {
			int i = 10 / 0;
			int a[] = new int[1];
			a[1] = 0;
			String s = null;
			if (s != null) {
				s = s.toUpperCase();
				System.out.println(s);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch (ArithmeticException ex) {

		} catch (NullPointerException ne) {

		} catch (Exception ex) {

		} finally {
			System.out.println("lock");
		}
		System.out.println("hello");
		System.out.println("welcome");
	}
}
