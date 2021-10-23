package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class JaggedArray {
	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		int[][] a = new int[2][];
		int columnSize;
		
		System.out.println(Arrays.deepToString(a));
		//0 0 0 0
		//1 0 0
		
		// to create each row of 2d array
		
		for(int i=0;i<2;i++)
		{
			System.out.println("Enter no of columns " + " for " + (i+1) + " rows");
		
			columnSize=sc.nextInt();
			
			a[i]=new int[columnSize];
			
			// a[0]=new int[3]
			// a[1]=new int[2];
		}
		
		System.out.println("Original Contents :-  ");
		
		System.out.println(Arrays.deepToString(a));
		
		
		// to update array elements
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.println("Enter number :- ");
				
				a[i][j]=sc.nextInt();
			}
						
		}
		
		// print array elements
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j] + " ");
			}
			
			System.out.println();
		}
		
		
	}
	

}
