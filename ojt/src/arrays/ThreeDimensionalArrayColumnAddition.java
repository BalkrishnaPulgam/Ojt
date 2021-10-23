package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ThreeDimensionalArrayColumnAddition {
	public static void main(String[] args) {
		
		
		int [] []  a=new int[3][3];
		int sum;
		System.out.println(Arrays.deepToString(a));
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 9 array elements");
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				a[i][j]=sc.nextInt();
			}
		}
		
		
		//sum of columns
		for(int j=0; j<3; j++) {
			sum=0;
			for(int i=0; i<3; i++) {
				sum=sum+a[i][j];
			}
			System.out.println("sum of column "+(j+1)+" is "+sum);
		}
	}

}
