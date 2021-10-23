package interviewProgram;

import java.util.Scanner;

public class VowelRemove {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter String");
		String str1=sc.next();
		
		String str2=str1.replaceAll("[AEIOUaeiou]", "");
		System.out.println("All Vowels Removed Successfulyy..!!!\n New String is : "+str2);
		sc.close();
		
	}

}
