package assignments;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharacterRead {
	public static void main(String[] args) throws IOException {
		
		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(isr);
		System.out.println("Enter Character: ");
		int d=br.read();
		
		
		System.out.println("You entered "+d);
		System.out.println("You entered "+(char)d);
		
	}

}
