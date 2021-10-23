package stringhandling;

import java.util.Scanner;

public class ScannerUse {
	public static void main(String[] args) {
		String s1 = "java is  easy";
		Scanner sc=new Scanner(s1);
		while(sc.hasNext()) {
			System.out.println(sc.next());
		}
		
		
		String input = "1 fish 2 fish red fish blue fish";
		Scanner scn=new Scanner(input).useDelimiter("\\s*fish\\s*");
		System.out.println(scn.nextInt());
		System.out.println(scn.nextInt());
		System.out.println(scn.next());
		System.out.println(scn.next());
	}

}
