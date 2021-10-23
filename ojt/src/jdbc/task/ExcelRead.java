package jdbc.task;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	public static void main(String[] args) throws IOException {

	//	String excelFilePath = ".\\datafiles\\JDBCTask.xlsx";
		String excelFilePath = ".\\datafiles\\sel.xlsx";

		FileInputStream input = new FileInputStream(excelFilePath);

		XSSFWorkbook workbook = new XSSFWorkbook(input);

		XSSFSheet sheet = workbook.getSheetAt(0);

		// using for loop
		int rows = sheet.getLastRowNum();
		int cols = sheet.getRow(1).getLastCellNum();
	
		for (int r = 0; r <= rows; r++) {
			XSSFRow row = sheet.getRow(r);
			for (int c = 0; c < cols; c++) {
				XSSFCell cell=row.getCell(c);
				
				switch(cell.getCellType()) {
				case STRING: System.out.print(cell.getStringCellValue()+"\t\t");break;
				case NUMERIC: System.out.print((int)cell.getNumericCellValue()+"\t\t");break;        //casting double to int
				case BOOLEAN: System.out.print(cell.getBooleanCellValue()+"\t\t");break;
				}
			}
			System.out.println();
		}
	}
}
