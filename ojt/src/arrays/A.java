package arrays;

import java.util.Arrays;

public class A {
	
	public static void main(String[] args) {
           //      0   1  2  3
		int[] a = {10,20,30,'a'};
		
		System.out.println(a);
		System.out.println(Arrays.toString(a));
		System.out.println(a[3]);
		
		a[1]=40;
		System.out.println(a[1]);
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		for (int element : a) {
			System.out.println(element);
		}
		
	}

}
