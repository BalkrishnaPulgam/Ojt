package jdbc.task;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Task4 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test22", "root", "root");
		Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/test2", "root", "root");
		
		String Analysis_Sec = "create table Analysis_Sec(eid int PRIMARY KEY, ename varchar(15), ephone int)";
		String Admin_Sec = "create table Admin_Sec(eid int PRIMARY KEY, ename varchar(15), ephone int)";
		String HR_Sec = "create table HR_Sec(eid int PRIMARY KEY, ename varchar(15), ephone int)";
		
		PreparedStatement ps4 = con1.prepareStatement(Analysis_Sec);
		PreparedStatement ps5 = con1.prepareStatement(Admin_Sec);
		PreparedStatement ps6 = con1.prepareStatement(HR_Sec);
		
		PreparedStatement ps = con1.prepareStatement("insert into Analysis_Sec values(?,?,?)");
		PreparedStatement ps1 = con1.prepareStatement("insert into Admin_Sec values(?,?,?)");
		PreparedStatement ps2 = con1.prepareStatement("insert into HR_Sec values(?,?,?)");
		
		PreparedStatement ps3 = con.prepareStatement("select * from employee");
		ResultSet rs = ps3.executeQuery();
		
	while(rs.next()) {
		
		int eid=rs.getInt("eid");
		String ename=rs.getString("ename");
		int ephone=rs.getInt("ephone");
		String Table_name=rs.getString("Table_name");
			
			if(Table_name.equals("Analysis_Sec")) {
				try {
					ps4.executeUpdate();
					System.out.println("Analysis_Sec Table not present,creating table & Adding in Analysis_Sec");
				}catch(Exception e){
					System.out.println("Already have table, Adding in Analysis_Sec");
				}
				finally {
					ps.setInt(1, eid);
					ps.setString(2, ename);
					ps.setInt(3, ephone);
					ps.executeUpdate();
				}
			}
			else if(Table_name.equals("Admin_Sec")) {
				try {
					ps5.executeUpdate();
					System.out.println("Admin_Sec Table not present,creating table & Adding in Admin_Sec");
				}catch(Exception e){
					System.out.println("Already have table, Adding in Admin_Sec");
				}
				finally {
					ps1.setInt(1, eid);
					ps1.setString(2, ename);
					ps1.setInt(3, ephone);
					ps1.executeUpdate();
				}
			}
			else if(Table_name.equals("HR_Sec")){
				try {
					ps6.executeUpdate();
					System.out.println("HR_Sec Table not present,creating table & Adding in HR_Sec");
				}catch(Exception e) {
					System.out.println("Already have table, Adding in HR_Sec");
			}
				finally {
					ps2.setInt(1, eid);
					ps2.setString(2, ename);
					ps2.setInt(3, ephone);
					ps2.executeUpdate();
				}
			}
		}
		
		System.out.println("\n Table created by using Table_name of Employee & all respective data added in table");

		
	}

}
