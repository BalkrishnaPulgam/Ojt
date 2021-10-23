package collection.sorting;

import java.util.TreeSet;

public class TreeSetSorting2 {
	public static void main(String[] args) {

		TreeSet<Employee> tr = new TreeSet<Employee>(new SortOnEno());

		tr.add(new Employee(1, 3000));
		tr.add(new Employee(2, 4000));
		tr.add(new Employee(3, 2000));
		
		
		System.out.println(tr);
		
		
		TreeSet<Employee> tr1= new TreeSet<Employee>(new SortOnSal());
		tr1.addAll(tr);
		
		System.out.println(tr1);
	}
}
