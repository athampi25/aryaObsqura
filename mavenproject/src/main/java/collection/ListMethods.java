package collection;

import java.util.LinkedList;
import java.util.List;

public class ListMethods {

	public static void main(String[] args) {
		List<Integer> i = new LinkedList<Integer>();
		i.add(12);
		i.add(45);
		i.add(67);
		i.add(8);
		System.out.println(i);
		System.out.println(i.get(2));
		i.set(2, 89);
		System.out.println(i);
		System.out.println(i.size());
		System.out.println(i.isEmpty());
		i.remove(2);
		System.out.println(i);
		System.out.println(i.contains(8));
		System.out.println(i.contains(89));
		System.out.println(i.indexOf(12));
		i.add(12);
		System.out.println(i);
		System.out.println(i.indexOf(12));
		System.out.println(i.lastIndexOf(12));

	}

}
