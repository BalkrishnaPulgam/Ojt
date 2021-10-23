package arrays;

	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.Collections;
	import java.util.List;

	public class ArrayPrint {
		
		public static void main(String[] args) {
//			           0  1  2--x axis
			int[] a= {30,20,10};
			
			System.out.println(a);
			
			
			String arrayContents=Arrays.toString(a);
			
			System.out.println(arrayContents);
			
			
			int[][]  a2= {{10,20},{30,40}};

			System.out.println(Arrays.deepToString(a2));
			
			ArrayList al = new ArrayList();
			
			al.add(1);
			al.add(2);
			
			List l = Arrays.asList(1,2,3,"dd");
			
			System.out.println(l);
			
			
			Object[] o = {10,20,3.5f,"dd"};
			
			/* copying Array Elements */
			
			//int[] copy=Arrays.copyOf(a, a.length);
			
			//int[] a= {30,20,10};
			
			int[] copy=Arrays.copyOf(a, 5);
			int[] c=Arrays.copyOf(a, 6);
			
			
			System.out.println("Length of Original Array is " + a.length);
			System.out.println("Length of new Array is " + copy.length);
			
			for(int i=0;i<copy.length;i++)
			{
				System.out.println(copy[i]);
			}
			
			
			
			int[] newcopy=Arrays.copyOf(a, 2);
			
			System.out.println("Length of Original Array is " + a.length);
			System.out.println("Length of new Array is " + newcopy.length);
			
			for(int i=0;i<newcopy.length;i++)
			{
				System.out.println(newcopy[i]);
			}
			
		
		}
	}



