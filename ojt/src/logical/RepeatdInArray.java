package logical;

import java.util.Arrays;
import java.util.Collections;

public class RepeatdInArray {
	
	public static void main(String[] args) {
		
		
		int [] a= {4,5,4,5,6,7,6,1,2,3};
		
		
		
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		for(int i=0; i<a.length;i++) {
			if(a[i]==a[i+1]) {
				a[i]--;
			}
		}
		
		
		System.out.println(a[a.length-1]);
		
	}

}
