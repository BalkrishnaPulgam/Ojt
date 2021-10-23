package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DiagnonalSum {
	
	public static void main(String[] args) {
		int[][] a=new int[3][3];
		
		int sum=0;
		
		System.out.println(Arrays.deepToString(a));
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter 9 array elements");
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println(Arrays.deepToString(a));
		//diagonal
		for(int i=0; i<3; i++) {
			
			for(int j=0; j<3; j++) {
				if(i==j) {
					sum=sum+a[i][j];
					
				}
			}
			
		}
		System.out.println("DiagnonalSum "+sum);
		
	}

}
