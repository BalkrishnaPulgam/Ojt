package jdbc.task;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Task3 {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {

		Class.forName("com.mysql.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/task3", "root", "root");
		
		PreparedStatement p = con.prepareStatement("create table student_clone(sid int,sname varchar(15), sphone int)");
		p.executeUpdate();
		
		PreparedStatement ps = con.prepareStatement("insert into student_clone values(?,?,?)");

		PreparedStatement ps1 = con.prepareStatement("select * from student");

		ResultSet rs = ps1.executeQuery();

		while (rs.next()) {

			int sid = rs.getInt("sid");
			String sname = rs.getString("sname");
			int sphone = rs.getInt("sphone");

			if (sname.contains("@")) {
				ps.setInt(1, sid);
				ps.setString(2, sname);
				ps.setInt(3, sphone);
				ps.executeUpdate();
			} else if (sname.contains("$")) {
				ps.setInt(1, sid);
				ps.setString(2, sname);
				ps.setInt(3, sphone);
				ps.executeUpdate();
			}

		}
		System.out.println("Done");
	}

}
