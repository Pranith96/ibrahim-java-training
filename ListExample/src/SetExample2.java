import java.util.LinkedHashSet;
import java.util.Set;

public class SetExample2 {

	public static void main(String[] args) {

		Set<Integer> set = new LinkedHashSet<>(); // HashSet<>(); TreeSet<>(); // Integer, String, student objects
		set.add(1);
		set.add(5);
		set.add(3);
		set.add(2);
		set.add(3);
		set.add(9);
		set.add(3);
		set.add(2);
		set.add(3);
		set.add(2);
		set.add(null);
		System.out.println(set);

		Integer length = set.size();
		System.out.println(length);
		boolean b = set.isEmpty();
		System.out.println(b);
		boolean b1 = set.contains(3);
		System.out.println(b1);
		set.remove(0);
		System.out.println(set);
		set.equals(set);
		

		System.out.println("..");
		int count = 0;
		for (Integer num : set) {
			System.out.println(num);
			if (count % 2 == 0) {
				System.out.println("Even number: " + num);
			}
			count++;
		}
		System.out.println("Count: " + count);
	}
}