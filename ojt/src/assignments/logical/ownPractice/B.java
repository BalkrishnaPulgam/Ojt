package assignments.logical.ownPractice;

import java.util.Arrays;

public class B {
	
	// Missing number from Array
	public static void main(String[] args) {
		int [] a= {10,5,15,25,35};
		
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		int temp;
		for(int i=0; i<a.length-1; i++) {
			temp=a[i]+5;
			while(temp<a[i+1]) {
				System.out.println(temp);
				temp=temp+5;
			}
		}
		
	}

}
