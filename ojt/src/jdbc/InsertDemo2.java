package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertDemo2 {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");

		PreparedStatement ps = con.prepareStatement("insert into emp(eno,ename) values(?,?)");

		
		for(int i=0; i<=3; i++) {
			
			System.out.println("Enter Employee Number :-  ");
			
			Scanner sc= new Scanner(System.in);
			
			ps.setInt(1, sc.nextInt());
			System.out.println("Enter Employee Name :-  ");
			ps.setString(2, sc.next());
			
			ps.executeUpdate();
			
			System.out.println("Record inserted");
			
		}
		
	}

}
