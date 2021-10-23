package reflection;

import java.io.Console;

public class ConsoleExample {
	public static void main(String[] args) {
		
		Console console=System.console();
		
		String name=console.readLine();
		
		System.out.println(name);
		
      char[] chars = console.readPassword();
		
		String password = new String(chars);
		
		System.out.println(password);
	}

}
