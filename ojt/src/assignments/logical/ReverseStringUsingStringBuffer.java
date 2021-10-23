package assignments.logical;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ReverseStringUsingStringBuffer {
	public static void main(String[] args) throws IOException {

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter any String: ");
		String str = br.readLine();
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		System.out.println(sb);
		br.close();
		
		
		
		
		

	}
}
