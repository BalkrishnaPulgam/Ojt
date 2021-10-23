package arrays;

import java.util.Scanner;

public class B {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Size of an array :-  ");
		int size=sc.nextInt();

		int [] a=new int[size];

		for (int element : a) {
			System.out.println(element);

		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter element :- ");
			a[i] = sc.nextInt(); // storing number into an array
		}
		System.out.println("Entered Elements are :-  ");

		for(int element : a )
		{

			System.out.println(element);
		}

	}
}
