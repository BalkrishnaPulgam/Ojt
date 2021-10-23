package jdbc.task;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Task2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/abc", "root", "root");
		Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/pqr1", "root", "root");
		/*
		String faculty = "create table Faculty(id int, name varchar(15), phone int)";
		String admin = "create table Admin(id int, name varchar(15), phone int)";
		String student = "create table Student(id int, name varchar(15), phone int)";
		
		PreparedStatement ps4 = con1.prepareStatement(faculty);
		PreparedStatement ps5 = con1.prepareStatement(admin);
		PreparedStatement ps6 = con1.prepareStatement(student);
		ps4.executeUpdate();
		ps5.executeUpdate();
		ps6.executeUpdate();
		
		System.out.println("Successfully table created..!!");
    */
		PreparedStatement ps = con1.prepareStatement("insert into faculty values(?,?,?)");
		PreparedStatement ps1 = con1.prepareStatement("insert into admin values(?,?,?)");
		PreparedStatement ps2 = con1.prepareStatement("insert into student values(?,?,?)");
		

		PreparedStatement ps3 = con.prepareStatement("select * from usertable");
		ResultSet rs = ps3.executeQuery();
		
		while(rs.next()) {
			
			int id=rs.getInt("id");
			String name=rs.getString("name");
			int phone=rs.getInt("phone");
			String role=rs.getString("role");
			
			
			if(role.equals("Faculty")) {
				ps.setInt(1, id);
				ps.setString(2, name);
				ps.setInt(3, phone);
				ps.executeUpdate();
			}
			else if(role.equals("Admin")) {
				ps1.setInt(1, id);
				ps1.setString(2, name);
				ps1.setInt(3, phone);
				ps1.executeUpdate();
			}
			else {
				ps2.setInt(1, id);
				ps2.setString(2, name);
				ps2.setInt(3, phone);
				ps2.executeUpdate();
			}
			
		}
		
		System.out.println("Done");

	}

}
