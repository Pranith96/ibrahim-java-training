
public class ResourseExample {

	// method level Synchronization
	public synchronized void printNum(int num) {
		for (int i = 0; i < num; i++) {
			System.out.println(i);
		}
	}

	// static method level Synchronization
//	public static synchronized void printNum(int num) {
//		for (int i = 0; i < num; i++) {
//			System.out.println(i);
//		}
//	}

	// static block level Synchronization
//	public void printNum(int num) {
//
//		synchronized (this) {
//			for (int i = 0; i < num; i++) {
//				System.out.println(i);
//			}
//		}
//
//		display();
//		System.out.println("Outside synchronized block");
//	}
//
//	public void display() {
//		for (int i = 0; i < 10; i++) {
//			System.out.println(i);
//		}
//	}
}
