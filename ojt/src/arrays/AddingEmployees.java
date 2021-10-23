package arrays;

import java.util.Arrays;

public class AddingEmployees {
	public static void main(String[] args) {
		int[] a = new int[3];
		Employee[] emp = new Employee[3];

		System.out.println(emp.getClass().getName());
		System.out.println(Arrays.toString(emp));

		// employees [null][null][null]
		// 0 1 2

		emp[0] = new Employee(1, 1000); // adding Employee object at 0 index
		emp[1] = new Employee(2, 2000); // adding Employee object at 1 index
		emp[2] = new Employee(3, 3000); // adding Employee object at 2 index

		System.out.println(Arrays.toString(emp));
		Employee e;
		for (int i = 0; i < emp.length; i++) {

			e = emp[i]; // Employee e = new Employee(1,90);
						// e--> [eno=1 dno=90 show()]Employee class object
			if (e.sal > 2000) {
				System.out.println(e.eno + " is having salary " + e.sal);
			}
		}

	}

}
