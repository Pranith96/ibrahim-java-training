
public class MainMethod {

	public static void main(String[] args) {
		ResourseExample re = new ResourseExample();
		ThreadClass1 t1 = new ThreadClass1(re);
		t1.start();
		
		ResourseExample re2 = new ResourseExample();
		ThreadClass2 t2 = new ThreadClass2(re2);
		t2.start();
	}
}
