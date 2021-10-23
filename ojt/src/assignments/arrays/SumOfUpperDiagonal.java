package assignments.arrays;

import java.util.Scanner;

public class SumOfUpperDiagonal {
	public static void main(String[] args) {

		int[][] a = new int[3][3];
		int uppersum = 0;
		int lowerSum=0;
		int reverse=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 9 Array elements");

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				a[i][j] = sc.nextInt();
			}
		}

		// printing
		for (int i = 0; i < 3; i++) {
		
			for (int j = 0; j < 3; j++) {
				if(i<j) {
					uppersum += a[i][j];
				}
			}
			
		}
		System.out.println("Sum Of Upper Diagonal Elements are:"+uppersum);
		
		
		
		// lower printing
				for (int i = 0; i < 3; i++) {
				
					for (int j = 0; j < 3; j++) {
						if(i>j) {
							lowerSum = lowerSum + a[i][j];
						}
					}
					
				}
				System.out.println("Sum Of Lower Diagonal Elements are:"+lowerSum);
				
		//	Reverse diagonal	
				for (int i = 0; i < 3; i++) {
					
					for (int j = 0; j < 3; j++) {
						if(i+j==(3-1)) {
							reverse += a[i][j];
						}
					}
					
				}
				System.out.println("Sum Of reverse Diagonal Elements are:"+reverse);
					

	}

}
