package collection;

public class MyGeneric<T> {
	T obj;

	MyGeneric(T obj) {

		this.obj = obj;
	}

	T getObject() {
		return obj;

	}
	
	public static void main(String[] args) {
		
		
		MyGeneric al6= new MyGeneric(new Integer(10));
		
		Integer p=(Integer) al6.getObject();
		
		MyGeneric<Integer> al= new MyGeneric(new Integer(10));
		al.getObject();
		
		MyGeneric<String> al1= new MyGeneric(new String("JBk"));
		al1.getObject();
		
	/*	MyGeneric<Student>  al3 = new MyGeneric(new Student(1,90,1000)); // obj--->[1,90,1000] Student class object
		Student s = al3.getObject();
		System.out.println(s);
		*/
		
		MyGeneric<String>  al4 = new MyGeneric(null);
		System.out.println(al4.getObject().length());
	}

}




class MyChild extends MyGeneric<String>
{

	MyChild(String obj) {
		super(obj);
		// TODO Auto-generated constructor stub
	}
	
}
