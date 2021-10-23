package reflection;


public class ObjectCreation {
	
	static Object getInstance(String name) throws Exception{
		return Class.forName(name).getConstructor().newInstance();
	}
	
	public static void main(String[] args) throws Exception {
		
		
		System.out.println(getInstance("reflection.Student"));
		System.out.println(getInstance("java.lang.String"));;
		//	System.out.println(getInstance("java.lang.System"));;
		
	Student s=(Student) Class.forName("reflection.Student").getConstructor(int.class,int.class).newInstance(1,90);
	System.out.println(s);
	
	
	}

}


/*
 * 
 * class TomcatServer
 * {
 * 	static Object getInstance(String name) throws Exception 
	{
		return Class.forName(name).getConstructor().newInstance();
	}
	 * 
 * }
 * 
 * class FirstServlet extends HttpServlet  {                }
 *doGet() 
 * 
 * 
 * URL===>localhost:8080/FirstServlet
 */
