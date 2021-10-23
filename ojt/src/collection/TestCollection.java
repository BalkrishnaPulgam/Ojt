package collection;

import java.util.ArrayList;

public class TestCollection {
	

	public static void main(String[] args) {

		//Object get(int index)

		//NON-Generic Collection

		ArrayList al = new ArrayList();
		al.add(10);// 0
		al.add("jbk");// 1

		String s = (String) al.get(1); // s-->["jbk"] String class object

		ArrayList<String> al3 = new ArrayList<String>();
		al3.add("jbk");// 0
		al3.add("java");// 1

		String s3 = al3.get(1); // s-->["java"] String class object

		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.add(10);// 0
		al2.add(20);// 1

		Integer s2 = al2.get(1); // s-->[20] Integer class object

	}

}
