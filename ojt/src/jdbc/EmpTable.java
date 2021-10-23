package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmpTable {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		
		PreparedStatement pst=con.prepareStatement("create table emp(eno int, ename varchar(15))");
		
		pst.executeUpdate();
		
		System.out.println("Table created");
	}

}
