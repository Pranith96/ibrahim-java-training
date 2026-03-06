
public class ThreadClass1 extends Thread {

	private ResourseExample resourseExample;

	public ThreadClass1(ResourseExample resourseExample) {
		this.resourseExample = resourseExample;
	}

	public void run() {
		resourseExample.printNum(10);
		//ResourseExample.printNum(20);
	}
}
