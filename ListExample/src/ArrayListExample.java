import java.util.List;
import java.util.Vector;

public class ArrayListExample {

	public static void main(String[] args) {
//		Student s1 = new Student(1, "Alice");
//		Student s2 = new Student(2, "Bob");
//		List<Student> list1 = new ArrayList<>();
//		list1.add(s1);
//		list1.add(s2);/// 5	
		List<Integer> list = new Vector<>(); // ArrayList<>(); LinkedList<>(); Vector<>(), ArrayListExample.java, Integer, String, student objects
		list.add(1);
		list.add(5);
		list.add(3);
		list.add(2);
		list.add(3);
		list.add(9);
		list.add(3);
		list.add(2);
		list.add(3);
		list.add(2);
		list.add(null);
		System.out.println(list);

		Integer i = list.get(3);
		System.out.println(i);
		Integer length = list.size();
		System.out.println(length);
		boolean b = list.isEmpty();
		System.out.println(b);
		boolean b1 = list.contains(3);
		System.out.println(b1);
		list.remove(0);
		System.out.println(list);
		list.equals(list);
		list.set(9, 1);
		System.out.println(list);
		int index = list.indexOf(1);
		System.out.println(index);

		System.out.println("..");
		for (int j = 0; j < length - 1; j++) {
			System.out.println(list.get(j)); // list.get(0), list.get(1), ...)
		}
		System.out.println("..");

		int count = 0;
		for (Integer num : list) {
			System.out.println(num);
			if (count % 2 == 0) {
				System.out.println("Even number: " + num);
			}
			count++;
		}
		System.out.println("Count: " + count);
	}
}