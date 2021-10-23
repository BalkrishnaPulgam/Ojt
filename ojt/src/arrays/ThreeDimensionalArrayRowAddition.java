package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ThreeDimensionalArrayRowAddition {
	
	
	public static void main(String[] args) {
		
		int[][] a = new int[3][3];
		
		System.out.println(Arrays.deepToString(a));
		
		int sum=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 9 Array elements");
		
		//assigning
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				a[i][j]=sc.nextInt();
			}
		}
		
		// printing
		for(int i=0; i<3; i++) {
			sum=0;
			for(int j=0; j<3; j++) {
				sum=sum+a[i][j];
			}
			System.out.println("Sum of row "+(i+1)+" is :"+sum);
		}
		
		
	}

}
