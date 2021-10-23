package jdbc.task;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class Task5 {
	
	public static void main(String[] args) throws IOException, URISyntaxException {
		
		 URL path = ClassLoader.getSystemResource("user.html");
		
		 File inputFile = new File(path.toURI());
		// Document doc = Jsoup.connect(path).get();
		 Document document = Jsoup.parse(inputFile, "UTF-8");
		   Element table =  document.select("table").first();
		   for (Element element:table.select("tr")){
		     for (Element td:element.select("td")){
		       System.out.println(td.text());
		     }
		   }
		
	}

}
