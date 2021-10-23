package jdbc.task;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelToDataBases {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {

		Class.forName("com.mysql.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pqr", "root", "root");

		Statement stmt = con.createStatement();

		String faculty = "create table Faculty(id int, name varchar(15), phone int, role varchar(15))";
		
		String admin = "create table Admin(id int, name varchar(15), phone int, role varchar(15))";
		String student = "create table Student(id int, name varchar(15), phone int, role varchar(15))";
		stmt.execute(faculty);
		stmt.execute(admin);
		stmt.execute(student);
		

		// excel
		String excelFilePath = ".\\datafiles\\JDBCTask.xlsx";

		FileInputStream input = new FileInputStream(excelFilePath);

		XSSFWorkbook workbook = new XSSFWorkbook(input);

		XSSFSheet sheet = workbook.getSheetAt(0);

		int rows = sheet.getLastRowNum();

		for (int r = 1; r <= rows; r++) {
			XSSFRow row = sheet.getRow(r);

			if (row.getCell(3).getStringCellValue().equals("Faculty")) {
				int id = (int) row.getCell(0).getNumericCellValue();
				String name = row.getCell(1).getStringCellValue();
				int phone = (int) row.getCell(2).getNumericCellValue();
				String role = row.getCell(3).getStringCellValue();
				faculty="insert into Faculty values('"+id+"','"+name+"','"+phone+"','"+role+"')";
				stmt.execute(faculty);
				stmt.execute("commit");
				
			}
			if (row.getCell(3).getStringCellValue().equals("Admin")) {
				int id = (int) row.getCell(0).getNumericCellValue();
				String name = row.getCell(1).getStringCellValue();
				int phone = (int) row.getCell(2).getNumericCellValue();
				String role = row.getCell(3).getStringCellValue();
				admin="insert into Admin values('"+id+"','"+name+"','"+phone+"','"+role+"')";
				stmt.execute(admin);
				stmt.execute("commit");
			}
			if (row.getCell(3).getStringCellValue().equals("Student")) {
				int id = (int) row.getCell(0).getNumericCellValue();
				String name = row.getCell(1).getStringCellValue();
				int phone = (int) row.getCell(2).getNumericCellValue();
				String role = row.getCell(3).getStringCellValue();
				student="insert into Student values('"+id+"','"+name+"','"+phone+"','"+role+"')";
				stmt.execute(student);
				stmt.execute("commit");
			}
		}
		
		System.out.println("Done!!");

	}

}
