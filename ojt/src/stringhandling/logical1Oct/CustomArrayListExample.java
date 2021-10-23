package stringhandling.logical1Oct;

import java.util.Arrays;

public class CustomArrayListExample {
	
	public static void main(String[] args) {
		int capacity=10;
		
		Object[] a= new Object[capacity];  //[10, Java, null, null, null, null, null, null, null, null]
		
		a[0]=10;
		a[1]="Java";
		
		System.out.println("Original array size :"+a.length);
		System.out.println("Original array contents :"+Arrays.toString(a));
		
		a=Arrays.copyOf(a, a.length*2);
		
		a[15]="Kirshna";
		a[19]="Radha";               //New array contents :[10, Java, null,-- Kirshna, null, null, null, Radha]
		
		System.out.println("New array size :"+a.length);
		System.out.println("New array contents :"+Arrays.toString(a));
		
		
	}

}
