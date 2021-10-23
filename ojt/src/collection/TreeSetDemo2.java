package collection;

import java.util.ArrayList;

public class TreeSetDemo2 {

	public static void main(String[] args) {

		ArrayList<Integer> set = new ArrayList<Integer>();
		set.add(10);
		// set.add("hh");
		System.out.println(set.add(10));
		;
		// set.add(null);

		// String s=(String) set.get(1);
		Integer i = set.get(0);

		System.out.println(set);

		System.out.println(set.contains(100));

	}
}
