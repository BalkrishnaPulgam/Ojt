package jdbc.task;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class CopyHtmlDataToExcelSheet {
	
	public static void main(String[] args) {
		XSSFWorkbook workbook=null;
		FileOutputStream fout=null;
		
		try
		  {		
			File input = new File("user.html");
			
			Document doc=Jsoup.parse(input, "UTF-8", "");
			
			System.out.println(doc);
			
			Element table=doc.select("table").get(0);   // Select First Table
			
			Elements rows=table.getElementsByTag("tr");
			
			 workbook = new XSSFWorkbook();
			
			XSSFSheet sheet=workbook.createSheet();
			
			XSSFRow exclrow;
			
			for(int i=0; i<rows.size(); i++) {
				
				exclrow=sheet.createRow(i);
				
				Element row=rows.get(i);
				
				Elements cols=row.select("td");
				
				int cellid=0;
				
				for(Element columnelement : cols) {
					
					XSSFCell cell=exclrow.createCell(cellid++);
					String str=columnelement.html();
					cell.setCellValue(str);
					System.out.println(str + " ");
				}
				System.out.println("Record added...!!!!");		
			}
			 fout =new FileOutputStream(".\\Tasks\\User.xlsx");
			workbook.write(fout);
					
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		finally 
		{
			try {
				
				workbook.close();
				fout.close();
			} 
			catch (Exception e) {
			
				e.printStackTrace();
			}

}
}}