package arrays;

import java.util.Arrays;

public class AddingObjects {
public static void main(String[] args) {
		
		String[] strings = new String[3];
		
		System.out.println(Arrays.toString(strings));
		
		//strings [null][null][null]
		//           0    1     2
		
		//strings[0].length();
		
		strings[0]=new String("Java");  // adding string object at 0 index
		strings[1]=new String("By");    // adding string object at 0 index
		strings[2]=new String("Kiran"); // adding string object at 0 index
		
		
		System.out.println(Arrays.toString(strings));
		
		
		for(int i=0;i<strings.length;i++)
		{
			String s = strings[i]; 
			System.out.println(s + " is having length " + s.length());
		}
	}

}
