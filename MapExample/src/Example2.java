import java.util.PriorityQueue;
import java.util.Queue;

public class Example2 {

	public static void main(String[] args) {
		Queue<Integer> queue = new PriorityQueue<>();
		// FIFO = First In First Out
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		queue.add(5);
		System.out.println(queue);
		Integer i = queue.peek();
		System.out.println(i);
		Integer popedValue = queue.poll();
		System.out.println(popedValue);
		System.out.println(queue);
		
		queue.poll();
		System.out.println(queue);
	}
}
