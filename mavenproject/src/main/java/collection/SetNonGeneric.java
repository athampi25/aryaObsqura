package collection;

import java.util.HashSet;
import java.util.Set;

public class SetNonGeneric {

	public static void main(String[] args) {
		Set i = new HashSet();
		Set j = new HashSet();
		i.add(2);
		i.add(4);
		i.add(6);
		i.add(8);
		j.add(1);
		j.add(4);
		j.add(5);
		j.add(8);
		System.out.println(i);
		System.out.println(j);
		i.addAll(j);
		System.out.println(i);
		System.out.println(i.size());
		System.out.println(i.isEmpty());
		System.out.println(i.contains(8));
		System.out.println(i.contains(12));
		System.out.println(i.containsAll(j));
		System.out.println(j.containsAll(i));
		i.remove(8);
		System.out.println(i);
		i.removeAll(j);
		System.out.println(i);
		i.clear();
		System.out.println(i);

	}

}
