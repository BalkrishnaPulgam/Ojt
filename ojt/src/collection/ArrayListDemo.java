package collection;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add(10); // 0
		al.add("JBk"); // 1 // [ [10] Integer class object [JBK] String class object] ArrayList class
						// object
		al.add("Krishna");

		for (Object o : al) {
			if (o instanceof Integer) {
				Integer k = (Integer) o;
				System.out.println(k.intValue());
			}

			if (o instanceof String) {
				String s = (String) o;
				System.out.println(s.length());
				System.out.println(s.valueOf(o));
			}
		}

		System.out.println(al);

		String str = al.toString();
		str = str.substring(0, str.length() - 1);

		System.out.println(str);
		Integer j = (Integer) al.get(0);
		System.out.println(j);

		for (int i = 0; i < al.size(); i++) {
			if (al.get(i) instanceof Integer) {
				Integer k = (Integer) al.get(i);
			}
			if (al.get(i) instanceof String) {
				String s = (String) al.get(i);
			}
		}

	}

}
