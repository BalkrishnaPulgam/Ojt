package assignments.logical.ownPractice;

import java.util.Arrays;

public class C {
	public static void main(String[] args) {

		int[] a = { 1, 2, 8, 6, 4 };
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		StringBuffer sb= new StringBuffer();
		
		int temp;
		sb.append("[");

		for (int i = 0; i < a.length-1; i++) {
			temp = a[i] + 1;
			sb.append(a[i]+" ");
			while (temp < a[i + 1]) {
				System.out.println(temp + " ");
				sb.append(temp+" ");
				temp = temp + 1;
			}
		}
		
		System.out.println(sb+"]");

	}

}
