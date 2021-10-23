package arrays;

import java.util.Scanner;

public class C {

public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter Size of an array :-  ");
	int size=sc.nextInt();
	
		
//  Student  s = new Student(1,90);
	
	int[]   a = new int[size];// a [0][0][0]

	System.out.println(a.getClass().getName());
	
	int sum=0;
	
		
	for(int i=0;i<size;i++)
	{
		System.out.println("Enter element :- ");
		a[i] = sc.nextInt(); // storing number into an array
	}
	
	
	//sum=0
	for(int element : a )
	{
			
		sum = sum + element;
	}
	
	
	System.out.println("Sum of all array elements are :- " + sum);
	
}

}
