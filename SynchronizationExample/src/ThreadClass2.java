
public class ThreadClass2 extends Thread {

	private ResourseExample resourseExample;

	public ThreadClass2(ResourseExample resourseExample) {
		this.resourseExample = resourseExample;
	}

	public void run() {
		resourseExample.printNum(5);
		//ResourseExample.printNum(20);
	}
}
