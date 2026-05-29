package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorProgram {

	public static void main(String[] args) {
		List<Integer> i = new ArrayList<Integer>();
		i.add(24);
		i.add(3);
		i.add(67);
		i.add(19);
		System.out.println(i);
		Iterator<Integer> j= i.iterator();
		while(j.hasNext()) {
			System.out.println(j.next());
		}
		j.remove();
		System.out.println(i);

	}

}
